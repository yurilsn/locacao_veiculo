package com.modelacao.locacao_veiculo.domain;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id", callSuper = false)
@Table(name = "NOTA_FISCAL")
@DynamicUpdate
@DynamicInsert
@ToString(of = "id")
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_NOTA_FISCAL")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_NOTA_FISCAL")
    private Long idNotaFiscal;

    @Column
    public LocalDate data;

    @Column
    public String local;

    @Column
    private String cliente;

    @Column
    private Integer valorTotal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cliente")
    private Usuario idUsuario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_locacao")
    private Locacao idLocacao;

}
