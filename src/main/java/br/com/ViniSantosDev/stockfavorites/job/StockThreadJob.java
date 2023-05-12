package br.com.ViniSantosDev.stockfavorites.job;

import br.com.ViniSantosDev.stockfavorites.entity.FavoriteStock;
import br.com.ViniSantosDev.stockfavorites.service.IFavoriteStockService;
import br.com.ViniSantosDev.stockfavorites.service.IStockService;
import br.com.ViniSantosDev.stockfavorites.utils.LogUtil;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockThreadJob implements DisposableBean, Runnable {

	@Autowired
	private IStockService acaoB3Service;

	@Autowired
	private IFavoriteStockService acaoFavoritaService;

	private Thread thread;
	private boolean someCondition;

	StockThreadJob() {
		this.thread = new Thread(this);
		this.thread.start();
		someCondition = true;
	}

	@Override
	public void run() {
		while (someCondition) {
			try {
				Thread.sleep(10000);
				// Poderia ser consultado em um banco em memória para ser mais rápido
				List<FavoriteStock> listaAcoes = acaoFavoritaService.listarSemDuplicidade();

				for (FavoriteStock acaoFavorita : listaAcoes) {
					acaoB3Service.atualizarValorAcao(acaoFavorita.getCodigo());
				}
			} catch (InterruptedException e) {
				LogUtil.error(e);
			}
		}
	}

	@Override
	public void destroy() {
		someCondition = false;
	}

}
