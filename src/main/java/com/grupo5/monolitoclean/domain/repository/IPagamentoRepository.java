package com.grupo5.monolitoclean.domain.repository;

import com.grupo5.monolitoclean.domain.entities.PagamentoModel;
import org.springframework.stereotype.Repository;

public interface IPagamentoRepository {
   PagamentoModel  registrarPagamento(PagamentoModel pagamentoModel);
}
