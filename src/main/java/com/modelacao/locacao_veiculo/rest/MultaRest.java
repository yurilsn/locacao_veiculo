package com.modelacao.locacao_veiculo.rest;


import com.modelacao.locacao_veiculo.domain.Multa;
import com.modelacao.locacao_veiculo.domain.Veiculo;
import com.modelacao.locacao_veiculo.service.MultaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/multa")
@AllArgsConstructor
public class MultaRest {
    private MultaService multaService;

    @PostMapping
    public ResponseEntity<String> registrar(@RequestBody Multa multa) {
        multaService.registrar(multa);
        return ResponseEntity.status(HttpStatus.OK).body("Roda Adcionada");
    }
}
