package com.modelacao.locacao_veiculo.domain;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id", callSuper = false)
@Table(name = "MOTO")
@DynamicUpdate
@DynamicInsert
@ToString(of = "id")
public class Moto{

    @Id
    @Column(name = "placa")
    private Long idMoto;

    @Column
    public String modeloMoto;

    @Column
    public String marcaCapacete;

    @Column
    private String guardaCapacete;

    @OneToOne
    @MapsId
    @JoinColumn(name = "placa")
    private Veiculo veiculo;

}
