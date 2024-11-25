package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Veiculo;
import com.modelacao.locacao_veiculo.repository.VeiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MotoService{

    private VeiculoRepository veiculoRepository;

    public void adcionarCapacete(Veiculo veiculo, Integer valor){
        Veiculo veiculoAddCapacete = veiculoRepository.findById(veiculo.getPlaca()).orElseThrow();
        veiculoAddCapacete.setValor(veiculo.getValor() + valor);
        veiculoRepository.save(veiculo);
    }
}
