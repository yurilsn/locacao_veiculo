package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepostory extends JpaRepository<Moto, Long> {
}
