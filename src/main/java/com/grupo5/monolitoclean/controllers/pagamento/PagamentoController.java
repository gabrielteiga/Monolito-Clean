package com.grupo5.monolitoclean.controllers.pagamento;

import com.grupo5.monolitoclean.application.dtos.PagamentoDTO;
import com.grupo5.monolitoclean.application.usecase.pagamento.RegistraPagamentoUC;
import com.grupo5.monolitoclean.domain.entities.PagamentoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registrarpagamento")
public class PagamentoController {
    private RegistraPagamentoUC registraPagamentoUC;

    @Autowired
    public PagamentoController(RegistraPagamentoUC registraPagamentoUC){
        this.registraPagamentoUC = registraPagamentoUC;
    }

    @PostMapping("")
    public PagamentoDTO registraPagamento(@RequestBody PagamentoModel pagamentoModel){
        return registraPagamentoUC.run(pagamentoModel);
    }
}
