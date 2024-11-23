package com.modelacao.locacao_veiculo.service;

import com.modelacao.locacao_veiculo.domain.Veiculo;
import com.modelacao.locacao_veiculo.repository.LocacaoRepository;
import com.modelacao.locacao_veiculo.repository.VeiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NotaFiscalService {

    private VeiculoRepository veiculoRepository;
    private LocacaoRepository locacaoRepository;


    public Integer getValorTotal(Long id){
        Integer valor = 0;
        List<Veiculo> veiculos =  veiculoRepository.findByLocacaoId(locacaoRepository.findById(id).orElseThrow());
        for (Veiculo veiculo : veiculos){
            valor += veiculo.getValor();
        }
        return valor;
    }

//    public Integer getValorTotal(Long id){
//
//    }
}
