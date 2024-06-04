package com.grupo5.monolitoclean.domain.services;

import com.grupo5.monolitoclean.domain.entities.AssinaturaModel;
import com.grupo5.monolitoclean.domain.repository.IAssinaturaRepository;
import com.grupo5.monolitoclean.domain.repository.StatusAssinatura;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class AssinaturaService {
    private IAssinaturaRepository assinaturaRepository;


    public AssinaturaService(IAssinaturaRepository assinaturaRepository){
        this.assinaturaRepository = assinaturaRepository;
    }



    public List<AssinaturaModel> listarAssinaturasPorStatusAtiva(StatusAssinatura statusAssinatura){
        LocalDate dataAtual = LocalDate.now();
        List<AssinaturaModel> assinaturasAux = assinaturaRepository.listarAssinaturas();
        for (AssinaturaModel assinaturaModelAtiva:assinaturasAux) {
            if (assinaturaModelAtiva.getFimVigencia().toInstant().isAfter(Instant.from(dataAtual))){
                assinaturasAux.add(assinaturaModelAtiva);
            }
        }
        return assinaturasAux;
    }

    public List<AssinaturaModel> listarAssinaturasPorStatusCancelada(StatusAssinatura statusAssinatura){
        LocalDate dataAtual = LocalDate.now();
        List<AssinaturaModel> assinaturasAux = assinaturaRepository.listarAssinaturas();
        for (AssinaturaModel assinaturaModelAtiva:assinaturasAux) {
            if (assinaturaModelAtiva.getFimVigencia().toInstant().isBefore(Instant.from(dataAtual))){
                assinaturasAux.add(assinaturaModelAtiva);
            }
        }
        return assinaturasAux;
    }
}
