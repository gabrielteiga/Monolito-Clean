package com.grupo5.monolitoclean.domain.repository;

import com.grupo5.monolitoclean.domain.entities.AplicativoModel;

import java.util.List;

public interface IAplicativoRepository {
    AplicativoModel registrarAplicativo(AplicativoModel aplicativo);
    List<AplicativoModel> listarAplicativos();
    AplicativoModel atualizarCustoMensal(long aplicativoId, float custoMensal);
}