package br.com.ViniSantosDev.stockfavorites.service.impl;

import br.com.ViniSantosDev.stockfavorites.dto.UsuarioDTO;
import br.com.ViniSantosDev.stockfavorites.entity.Usuario;
import br.com.ViniSantosDev.stockfavorites.service.IUsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    @Override
    public UsuarioDTO consultar(String login) {
        return null;
    }

    @Override
    public Usuario consultarEntidade(String login) {
        return null;
    }
}
