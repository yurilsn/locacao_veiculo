package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Locacao;
import com.modelacao.locacao_veiculo.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByLocacaoId(Locacao locacao);

}
