package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Usuario;
import com.modelacao.locacao_veiculo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    public UsuarioRepository usuarioRepository;

    public void registrar(Usuario usuario){
        System.out.println("############################### Printando o usuario: " + usuario);
        usuarioRepository.save(usuario);
    };

    public void autenticar(){}

    public void locar(){}

    public void eliminar(){}

    public void vincularCnh(){}

}
