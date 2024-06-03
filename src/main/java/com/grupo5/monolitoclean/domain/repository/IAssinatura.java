package com.grupo5.monolitoclean.domain.repository;

import com.grupo5.monolitoclean.domain.entities.AssinaturaModel;

import java.util.List;

public interface IAssinatura {
    AssinaturaModel registrarAssinatura(AssinaturaModel assinaturaModel);
    List<AssinaturaModel> listarAssinaturas();
    List<AssinaturaModel> listarAssinaturasPorCliente(long codigoDoCliente);
    List<AssinaturaModel> listarAssinaturasPorAplicativo(long codigoDoAplicativo);
    List<AssinaturaModel> listarAssinaturasPorStatus(StatusAssinatura statusAssinatura);
    AssinaturaModel buscaAssinaturaPorCodigo(long codigoDaAssinatura);
}
