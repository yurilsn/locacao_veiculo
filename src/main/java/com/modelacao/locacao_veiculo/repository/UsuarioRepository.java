package com.modelacao.locacao_veiculo.repository;

import com.modelacao.locacao_veiculo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
