package br.com.ViniSantosDev.stockfavorites.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FavoriteStockDTO {

    @NotBlank
    private String loginUsuario;
    @NotBlank
    private String codigo;
}
