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

    @PostMapping("/Registrar")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<Usuario>> registrar(@RequestBody Usuario usuario) {
        usuarioService.registrar(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/autenticar")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> autenticar(@RequestBody Usuario usuario) {
        Boolean autenticacao = usuarioService.autenticar(usuario.email, usuario.senha);
        if(autenticacao){
            return new ResponseEntity<>("Usuário não encontrado ou senha incorreta", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Usuario correto", HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> eliminar(@PathVariable("id") Long id){
        usuarioService.eliminar(id);
        return ResponseEntity.status(HttpStatus.OK).body("Usuário eliminado");
    }

    @PutMapping("/atualizar_cnh/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> vincularCnh(@PathVariable("id") Long id){
        usuarioService.vincularCnh(id);
        return ResponseEntity.status(HttpStatus.OK).body("Usuário eliminado");
    }

}
