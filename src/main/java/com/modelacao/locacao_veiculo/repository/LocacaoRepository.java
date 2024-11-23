package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Locacao;
import com.modelacao.locacao_veiculo.domain.Usuario;
import com.modelacao.locacao_veiculo.domain.Veiculo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

//    List<Locacao> findByUsuarioId(Usuario usuario);

}
