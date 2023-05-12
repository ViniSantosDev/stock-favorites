package br.com.ViniSantosDev.stockfavorites.resource;

import br.com.ViniSantosDev.stockfavorites.dto.FavoriteStockDTO;
import br.com.ViniSantosDev.stockfavorites.service.IFavoriteStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/acoes")
public class FavoriteStockResource extends ResourceBase<FavoriteStockDTO> {

	@Autowired
	private IFavoriteStockService acaoFavoritaService;

	@PostMapping("/favorita")
	public ResponseEntity<FavoriteStockDTO> salvar(@RequestBody @Valid FavoriteStockDTO acaoFavoritaDTO) {
		FavoriteStockDTO acaoFavoritaRetorno = acaoFavoritaService.salvar(acaoFavoritaDTO);
		return responderSucessoComItem(acaoFavoritaRetorno);
	}

}
