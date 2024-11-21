package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Carro;
import com.modelacao.locacao_veiculo.domain.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {
}
