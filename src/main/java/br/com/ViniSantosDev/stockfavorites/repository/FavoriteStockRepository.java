package br.com.ViniSantosDev.stockfavorites.repository;

import br.com.ViniSantosDev.stockfavorites.entity.FavoriteStock;
import br.com.ViniSantosDev.stockfavorites.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteStockRepository extends JpaRepository<FavoriteStock, Long > {

    List<FavoriteStock> findByUsuario(Usuario usuario);

    FavoriteStock findByCodigoAndUsuario(String codigo, Usuario usuario);

}
