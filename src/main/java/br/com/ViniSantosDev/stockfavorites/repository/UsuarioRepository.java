package br.com.ViniSantosDev.stockfavorites.repository;

import br.com.ViniSantosDev.stockfavorites.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByLogin(String login);

}
