package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Veiculo;
import com.modelacao.locacao_veiculo.repository.VeiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VeiculoService {

    private VeiculoRepository veiculoRepository;
    public void registrar(Veiculo veiculo){
        veiculoRepository.save(veiculo);

    };
    public void atribuirIdentificacao(){

    };
}
