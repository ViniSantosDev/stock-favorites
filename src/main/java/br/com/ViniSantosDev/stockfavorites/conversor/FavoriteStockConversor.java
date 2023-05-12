package br.com.ViniSantosDev.stockfavorites.conversor;

import br.com.ViniSantosDev.stockfavorites.dto.FavoriteStockDTO;
import br.com.ViniSantosDev.stockfavorites.entity.FavoriteStock;
import br.com.ViniSantosDev.stockfavorites.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteStockConversor extends ConversorBase<FavoriteStock, FavoriteStockDTO> {

	@Autowired
	private IUsuarioService usuarioService;

	@Override
	public FavoriteStockDTO converterEntidadeParaDto(FavoriteStock entidade) {
		return FavoriteStockDTO.builder().codigo(entidade.getCodigo()).build();
	}


	@Override
	public FavoriteStock converterDtoParaEntidade(FavoriteStockDTO dto) {
		return FavoriteStock
		.builder()
		.codigo(dto.getCodigo())
		.usuario(usuarioService.consultarEntidade(dto.getLoginUsuario()))
		.build();
	}

}
