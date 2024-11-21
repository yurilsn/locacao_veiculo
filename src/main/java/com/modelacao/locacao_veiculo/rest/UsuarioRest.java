package com.modelacao.locacao_veiculo.rest;

import com.modelacao.locacao_veiculo.domain.Usuario;
import com.modelacao.locacao_veiculo.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
@AllArgsConstructor
public class UsuarioRest {

    public UsuarioService usuarioService;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<Usuario>> save(@RequestBody Usuario usuario) {
        usuarioService.registrar(usuario);
        return ResponseEntity.ok().build();
    }

}
