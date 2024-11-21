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
@Table(name = "CARRO")
@DynamicUpdate
@DynamicInsert
@ToString(of = "id")
public class Carro{

    @Id
    @Column(name = "placa")
    private Long idCarro;

    @Column
    public String modeloCarro;

    @Column
    public Boolean arCondicionado;

    @Column
    public Boolean tamanhoPortaMala;

    @OneToOne
    @MapsId
    @JoinColumn(name = "placa")
    private Veiculo veiculo;

}
