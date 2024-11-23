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
@Table(name = "USUARIO")
@DynamicUpdate
@DynamicInsert
@ToString(of = "id")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")
    @SequenceGenerator(initialValue = 1, allocationSize = 1, name = "SEQ_USUARIO")
    @Column(name = "usuario_id")
    private Long id;

    @Column
    public String email;

    @Column
    public String senha;

    @Column
    private Boolean cnh;

    @Column
    protected Integer nivelPermissao;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Socio socio;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Cliente cliente;
}
