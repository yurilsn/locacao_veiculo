package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
