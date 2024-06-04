package com.grupo5.monolitoclean.application.dtos;

import com.grupo5.monolitoclean.domain.entities.PagamentoModel;

public record PagamentoDTO(
        String dataPagamento,
        long codigoAssinatura,
        double valorPago
) {
    public static PagamentoDTO fromModel(PagamentoModel pagamento) {
        return new PagamentoDTO(pagamento.getDataPagamento().toString(), pagamento.getAssinatura().getCodigo(), pagamento.getValorPago().doubleValue());
    }
}
