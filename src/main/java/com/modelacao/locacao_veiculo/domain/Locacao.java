package com.modelacao.locacao_veiculo.domain;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id", callSuper = false)
@Table(name = "LOCACAO")
@DynamicUpdate
@DynamicInsert
@ToString(of = "id")
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LOCACAO")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_LOCACAO")
    private Long idLocacao;

    @Column
    public LocalDate dataInicio;

    @Column
    public LocalDate dataFim;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_locacao", referencedColumnName = "idLocacao")
    private List<Veiculo> veiculos;

}
