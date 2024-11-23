package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Locacao;
import com.modelacao.locacao_veiculo.domain.Usuario;
import com.modelacao.locacao_veiculo.repository.LocacaoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LocacaoService {

    private LocacaoRepository locacaoRepository;

    public void locar(Usuario usuario, Locacao locacao){
        locacao.setUsuarioId(usuario);
        locacaoRepository.save(locacao);
    }
    public void finalizarLocacao(){}
}
