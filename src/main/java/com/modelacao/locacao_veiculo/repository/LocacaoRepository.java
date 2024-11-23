package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {
    List<Locacao> findByUsuarioId(Long id);
}
