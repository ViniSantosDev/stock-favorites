package br.com.ViniSantosDev.stockfavorites.service.impl;

import br.com.ViniSantosDev.stockfavorites.dto.FavoriteStockDTO;
import br.com.ViniSantosDev.stockfavorites.entity.FavoriteStock;
import br.com.ViniSantosDev.stockfavorites.entity.Usuario;
import br.com.ViniSantosDev.stockfavorites.service.IFavoriteStockService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteStockService implements IFavoriteStockService {

    @Override
    public FavoriteStock salvar(FavoriteStock acaoFavorita) {
        return null;
    }

    @Override
    public FavoriteStockDTO salvar(FavoriteStockDTO acaoFavoritaDTO) {
        return null;
    }

    @Override
    public List<FavoriteStock> listar(Usuario usuario) {
        return null;
    }

    @Override
    public List<FavoriteStock> listarSemDuplicidade() {
        return null;
    }
}
