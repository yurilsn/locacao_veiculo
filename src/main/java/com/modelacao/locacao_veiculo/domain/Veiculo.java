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
@EqualsAndHashCode(of = "placa", callSuper = false)
@Table(name = "VEICULO")
@DynamicUpdate
@DynamicInsert
@ToString(of = "placa")
public class Veiculo{


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VEICULO")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_VEICULO")
    public Long placa;

    @Column
    public String status;

    @Column
    public LocalDate dataRegistro;

    @OneToOne(mappedBy = "veiculo", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Carro carro;

    @OneToOne(mappedBy = "veiculo", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Moto moto;

}
