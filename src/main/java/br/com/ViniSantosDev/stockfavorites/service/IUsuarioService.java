package br.com.ViniSantosDev.stockfavorites.service;

import br.com.ViniSantosDev.stockfavorites.dto.UsuarioDTO;
import br.com.ViniSantosDev.stockfavorites.entity.Usuario;

public interface IUsuarioService {

	UsuarioDTO consultar(String login);
	
	Usuario consultarEntidade(String login);

}
