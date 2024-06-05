package com.grupo5.monolitoclean.domain.services;

import com.grupo5.monolitoclean.domain.entities.AplicativoModel;
import com.grupo5.monolitoclean.domain.repository.IAplicativoRepository;

import java.util.List;

public class AplicativoService {
    private IAplicativoRepository aplicativoRepository;

    public AplicativoService(IAplicativoRepository aplicativoRepository){
        this.aplicativoRepository = aplicativoRepository;
    }

    public List<AplicativoModel> aplicativosCadastrados(){
        return aplicativoRepository.listarAplicativos();
    }

    public AplicativoModel atualizaCusto(long aplicativoId, float custoMensal) { //CHECAR SE É DOUBLE OU FLOAT
        return aplicativoRepository.atualizarCustoMensal(aplicativoId, custoMensal);
    }
}
