package com.modelacao.locacao_veiculo.rest;


import com.modelacao.locacao_veiculo.domain.NotaFiscal;
import com.modelacao.locacao_veiculo.domain.Usuario;
import com.modelacao.locacao_veiculo.repository.LocacaoRepository;
import com.modelacao.locacao_veiculo.service.NotaFiscalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/nota_fiscal")
@AllArgsConstructor
public class NotaFiscalRest {

    private NotaFiscalService notaFiscalService;

    @GetMapping("/valorTotal/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> setValorTotal(@RequestParam("id") Long id) {
        notaFiscalService.setValorTotal(id);
        return ResponseEntity.ok().build();
    }
}
