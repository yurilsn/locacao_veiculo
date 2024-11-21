package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Carro;
import com.modelacao.locacao_veiculo.domain.Multa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultaRepository extends JpaRepository<Multa, Long> {
}
