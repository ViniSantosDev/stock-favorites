package br.com.ViniSantosDev.stockfavorites.service;

import br.com.ViniSantosDev.stockfavorites.dto.FavoriteStockDTO;
import br.com.ViniSantosDev.stockfavorites.entity.FavoriteStock;
import br.com.ViniSantosDev.stockfavorites.entity.Usuario;


import java.util.List;

public interface IFavoriteStockService {

	FavoriteStock salvar(FavoriteStock acaoFavorita);

	FavoriteStockDTO salvar(FavoriteStockDTO acaoFavoritaDTO);

	List<FavoriteStock> listar(Usuario usuario);

	List<FavoriteStock> listarSemDuplicidade();
}
