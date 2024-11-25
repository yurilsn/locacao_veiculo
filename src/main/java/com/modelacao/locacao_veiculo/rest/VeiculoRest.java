package com.modelacao.locacao_veiculo.rest;


import com.modelacao.locacao_veiculo.domain.Usuario;
import com.modelacao.locacao_veiculo.domain.Veiculo;
import com.modelacao.locacao_veiculo.repository.VeiculoRepository;
import com.modelacao.locacao_veiculo.service.CarroService;
import com.modelacao.locacao_veiculo.service.MotoService;
import com.modelacao.locacao_veiculo.service.VeiculoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/veiculo")
@AllArgsConstructor
public class VeiculoRest {

    private VeiculoService veiculoService;
    private CarroService carroService;
    private MotoService motoService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<Veiculo>> registrar(@RequestBody Veiculo veiculo) {
        veiculoService.registrar(veiculo);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/carro/{valor}")
    public ResponseEntity<String> adcionarRodaReserva(@RequestBody Veiculo veiculo, @PathVariable("valor") Integer valor) {
        carroService.adcionarRodaReserva(veiculo, valor);
        return ResponseEntity.status(HttpStatus.OK).body("Roda Adcionada");
    }

    @PostMapping("/moto/{valor}")
    public ResponseEntity<String> adcionarCapacete(@RequestBody Veiculo veiculo, @PathVariable("valor") Integer valor) {
        motoService.adcionarCapacete(veiculo, valor);
        return ResponseEntity.status(HttpStatus.OK).body("Capacete adcionado");
    }
}
