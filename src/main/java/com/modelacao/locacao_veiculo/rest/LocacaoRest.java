package com.modelacao.locacao_veiculo.rest;

import com.modelacao.locacao_veiculo.domain.Locacao;
import com.modelacao.locacao_veiculo.repository.LocacaoRepository;
import com.modelacao.locacao_veiculo.service.LocacaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/locacao")
@AllArgsConstructor
public class LocacaoRest {

    private LocacaoService locacaoService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<Locacao>> locar(@RequestBody Locacao locacao) {
        locacaoService.locar(locacao);
        return ResponseEntity.ok().build();
    }
}
