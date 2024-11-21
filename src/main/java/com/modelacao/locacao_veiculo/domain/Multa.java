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
@Table(name = "MULTA")
@DynamicUpdate
@DynamicInsert
@ToString(of = "id")
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MULTA")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_MULTA")
    private Long idMulta;

    @Column
    public LocalDate data;

    @Column
    public Integer valor;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario_id;
}
