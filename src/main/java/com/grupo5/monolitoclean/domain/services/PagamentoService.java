package com.grupo5.monolitoclean.domain.services;

import com.grupo5.monolitoclean.domain.entities.PagamentoModel;
import com.grupo5.monolitoclean.domain.repository.IPagamentoRepository;
import com.grupo5.monolitoclean.application.dtos.PagamentoDTO;

import java.util.List;

public class PagamentoService {
    private IPagamentoRepository pagamentoRepository;

    public PagamentoService(IPagamentoRepository pagamentoRepository){
        this.pagamentoRepository = pagamentoRepository;
    }

    public PagamentoModel registraPagamento(PagamentoModel PagamentoDTO) {
        return pagamentoRepository.registrarPagamento(PagamentoModel PagamentoDTO);
    }
}
