package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Multa;
import com.modelacao.locacao_veiculo.repository.MultaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MultaService {

    private MultaRepository multaRepository;

    public void registrar(Multa multa){
        multaRepository.save(multa);
    }
}
