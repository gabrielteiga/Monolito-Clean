package com.grupo5.monolitoclean.application.usecase.pagamento;

import com.grupo5.monolitoclean.application.dtos.PagamentoDTO;
import com.grupo5.monolitoclean.domain.entities.PagamentoModel;
import org.springframework.stereotype.Component;

@Component
public class RegistraPagamentoUC {
    private PagamentoService pagamentoService;

    public RegistraPagamentoUC(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    public PagamentoDTO run(PagamentoDTO pagamentoDTO){
        PagamentoModel pagamento = pagamentoService.registraPagamento(pagamentoDTO);
        return PagamentoDTO.fromModel(pagamento);
    }
}
