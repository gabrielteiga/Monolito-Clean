package com.grupo5.monolitoclean.repository;

import com.grupo5.monolitoclean.domain.entities.AssinaturaModel;
import com.grupo5.monolitoclean.domain.repository.IAssinaturaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AssinaturaMemRepository implements IAssinaturaRepository {
    private List<AssinaturaModel> assinaturas;

    public AssinaturaMemRepository(){
        assinaturas = new ArrayList<>();
    }

    @Override
    public AssinaturaModel registrarAssinatura(AssinaturaModel assinaturaModel){
        long codigo = assinaturaModel.getCodigo();
        if (buscaAssinaturaPorCodigo(codigo) == null){
            assinaturas.add(assinaturaModel);
            return assinaturaModel;
        }
        return null;
    }

    @Override
    public List<AssinaturaModel> listarAssinaturas(){
        return assinaturas;
    }

    @Override
    public List<AssinaturaModel> listarAssinaturasPorCodCliente(long codigoDoCliente){
        assinaturas.stream()
                .filter(p -> p.getCodigo() == codigoDoCliente)
                .collect(Collectors.toList());
                return assinaturas;
    }

    @Override
    public List<AssinaturaModel> listarAssinaturasPorCodAplicativo(long codigoDoAplicativo){
        assinaturas.stream()
                .filter(p -> p.getAplicativo().getCodigo() == codigoDoAplicativo)
                .collect(Collectors.toList());
        return assinaturas;
    }

    @Override
    public AssinaturaModel buscaAssinaturaPorCodigo(long codigoDaAssinatura){
        for (AssinaturaModel aux:assinaturas) {
            if (aux.getCodigo() == codigoDaAssinatura){
                return aux;
            }
        }
        return null;
    }
}
