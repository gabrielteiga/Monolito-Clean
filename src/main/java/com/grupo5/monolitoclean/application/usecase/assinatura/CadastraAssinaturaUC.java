package com.grupo5.monolitoclean.application.usecase.assinatura;

import com.grupo5.monolitoclean.application.dtos.AssinaturaDTO;
import com.grupo5.monolitoclean.domain.entities.AssinaturaModel;
import com.grupo5.monolitoclean.domain.services.AssinaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraAssinaturaUC {
    private AssinaturaService cadastraAssinatura;

    @Autowired
    public CadastraAssinaturaUC(AssinaturaService assinaturaService){
        this.cadastraAssinatura = assinaturaService;
    }

    public AssinaturaDTO run(AssinaturaModel assinaturaModel){
        AssinaturaModel assinatura = cadastraAssinatura.registraAssinatura(assinaturaModel);
        return AssinaturaDTO.fromModel(assinatura);
    }
}
