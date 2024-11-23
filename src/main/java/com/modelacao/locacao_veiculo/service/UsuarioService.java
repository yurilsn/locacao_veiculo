package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Usuario;
import com.modelacao.locacao_veiculo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public void registrar(Usuario usuario){
        System.out.println("############################### Printando o usuario: " + usuario);
        usuarioRepository.save(usuario);
    };

    public boolean autenticar(String email, String senha){
        Optional<Usuario> usuario = usuarioRepository.findByEmailAndSenha(email, senha);
        if (usuario.isEmpty()) return false;
        return true;
    }

    public void locar(){}

    public void eliminar(Long id){
        usuarioRepository.deleteById(id);
    }

    public void vincularCnh(Long id){
        Usuario novoUsuario = usuarioRepository.findById(id).orElseThrow();
        novoUsuario.setCnh(novoUsuario.getCnh());
        usuarioRepository.save(novoUsuario);
    }

}
