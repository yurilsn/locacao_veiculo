package com.modelacao.locacao_veiculo.domain;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id", callSuper = false)
@Table(name = "CLIENTE")
@DynamicUpdate
@DynamicInsert
@ToString(of = "id")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTE")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_CLIENTE")
    @Column(name = "usuario_id")
    private Long id;


    @OneToOne
    @MapsId
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;



}
