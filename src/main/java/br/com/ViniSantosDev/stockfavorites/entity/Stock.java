package br.com.ViniSantosDev.stockfavorites.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false, exclude = {"usuario"})
@Entity
@Table(name = "ACOES_FAVORITAS")
public class Stock extends BaseEntity {


    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "AF_USUARIO_ID", nullable = false)
    private Usuario usuario;

    @Column(name = "AF_CODIGO", nullable = false)
    private String codigo;

}

