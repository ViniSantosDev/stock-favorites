package br.com.ViniSantosDev.stockfavorites.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuarioDTO {


    private String login;
    private String senha;
    private String email;
    private String nome;
    private List<FavoriteStockDTO> acoesFavoritas;
    private Boolean ativo;
}
