package br.com.ViniSantosDev.stockfavorites.conversor;

import br.com.ViniSantosDev.stockfavorites.dto.UsuarioDTO;
import br.com.ViniSantosDev.stockfavorites.entity.FavoriteStock;
import br.com.ViniSantosDev.stockfavorites.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioConversor extends ConversorBase<Usuario, UsuarioDTO> {

	@Autowired
	private FavoriteStockConversor acaoFavoritaConversor;
	
	@Override
	public UsuarioDTO converterEntidadeParaDto(Usuario entidade) {
		return UsuarioDTO.builder()
		.nome(entidade.getNome())
		.login(entidade.getLogin())
		.senha(entidade.getSenha())
		.email(entidade.getEmail())
		.ativo(entidade.getAtivo())
		.build();
	}
	
	public UsuarioDTO converterEntidadeParaDto(Usuario usuario, List<FavoriteStock> acoes) {
		return UsuarioDTO.builder()
		.nome(usuario.getNome())
		.login(usuario.getLogin())
		.senha(usuario.getSenha())
		.email(usuario.getEmail())
		.ativo(usuario.getAtivo())
		.acoesFavoritas(acaoFavoritaConversor.converterEntidadesParaDtos(acoes))
		.build();
	}

	@Override
	public Usuario converterDtoParaEntidade(UsuarioDTO dto) {
		return null;
	}

}
