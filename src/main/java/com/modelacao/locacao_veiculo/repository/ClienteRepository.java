package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
