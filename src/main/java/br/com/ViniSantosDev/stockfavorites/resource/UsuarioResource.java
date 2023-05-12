package br.com.ViniSantosDev.stockfavorites.resource;


import br.com.ViniSantosDev.stockfavorites.dto.UsuarioDTO;
import br.com.ViniSantosDev.stockfavorites.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource extends ResourceBase<UsuarioDTO> {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/{login}")
	public ResponseEntity<UsuarioDTO> consultar(@PathVariable String login) {
		UsuarioDTO usuario = usuarioService.consultar(login);
		if (usuario == null) {
			return responderItemNaoEncontrado();
		}
		return responderSucessoComItem(usuario);
	}

}