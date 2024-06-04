package com.grupo5.monolitoclean.domain.repository;

import com.grupo5.monolitoclean.domain.entities.PagamentoModel;

public interface IPagamentoRepository {
    void registrarPagamento(PagamentoModel pagamentoModel);
}
