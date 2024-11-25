package com.modelacao.locacao_veiculo.rest;


import com.modelacao.locacao_veiculo.domain.NotaFiscal;
import com.modelacao.locacao_veiculo.repository.LocacaoRepository;
import com.modelacao.locacao_veiculo.repository.NotaFiscalRepository;
import com.modelacao.locacao_veiculo.repository.UsuarioRepository;
import com.modelacao.locacao_veiculo.service.NotaFiscalService;
import com.modelacao.locacao_veiculo.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/nota_fiscal")
@AllArgsConstructor
public class NotaFiscalRest {

    private NotaFiscalService notaFiscalService;
    private UsuarioRepository usuarioRepository;
    private LocacaoRepository locacaoRepository;
    private NotaFiscalRepository notaFiscalRepository;

    @GetMapping("/valorTotal/{idLocacao}/{idUsuario}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> ValorTotal(@RequestParam("idLocacao") Long idLocacao, @RequestParam("idUsuario") Long idUsuario) {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setValorTotal(notaFiscalService.getValorTotal(idLocacao));
        notaFiscal.setData(LocalDate.now());
        notaFiscal.setLocal(usuarioRepository.findById(idUsuario).orElseThrow().getEmail());
        notaFiscal.setIdLocacao(locacaoRepository.findById(idLocacao).orElseThrow());
        notaFiscal.setIdUsuario(usuarioRepository.findById(idUsuario).orElseThrow());
        notaFiscalRepository.save(notaFiscal);

        return ResponseEntity.ok().build();
    }

}
