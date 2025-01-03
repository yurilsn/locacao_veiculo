package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Veiculo;
import com.modelacao.locacao_veiculo.repository.VeiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarroService{
    private VeiculoRepository veiculoRepository;

    public void adcionarRodaReserva(Veiculo veiculo, Integer valor){
        Veiculo veiculoAddRoda = veiculoRepository.findById(veiculo.getPlaca()).orElseThrow();
        veiculoAddRoda.setValor(veiculo.getValor() + valor);
        veiculoRepository.save(veiculo);
    }
}
