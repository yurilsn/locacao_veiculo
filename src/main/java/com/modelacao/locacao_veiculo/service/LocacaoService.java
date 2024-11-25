package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Locacao;
import com.modelacao.locacao_veiculo.domain.Usuario;
import com.modelacao.locacao_veiculo.repository.LocacaoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LocacaoService {

    private LocacaoRepository locacaoRepository;

    public void locar(Locacao locacao){
        locacaoRepository.save(locacao);
    }
    public void finalizarLocacao(){}
}
