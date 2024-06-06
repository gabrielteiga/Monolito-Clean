package com.grupo5.monolitoclean.repository;

import com.grupo5.monolitoclean.domain.entities.AssinaturaModel;
import com.grupo5.monolitoclean.domain.repository.IAssinaturaRepository;
import com.grupo5.monolitoclean.domain.repository.IClienteRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AssinaturaMemRepository implements IAssinaturaRepository {
    private List<AssinaturaModel> assinaturas;
    private IClienteRepository clienteRepository;

    public AssinaturaMemRepository(){
        assinaturas = new ArrayList<>();
        assinaturas.add(new AssinaturaModel(1, 111));
        assinaturas.add(new AssinaturaModel(2, 222));
        assinaturas.add(new AssinaturaModel(3, 333));
        assinaturas.add(new AssinaturaModel(4, 444));
        assinaturas.add(new AssinaturaModel(5, 555));
    }

    @Override
    public AssinaturaModel registrarAssinatura(long codcli, long codapp){
        AssinaturaModel assinaturaModel = new AssinaturaModel(codcli, codapp);
            assinaturas.add(assinaturaModel);
            return assinaturaModel;
    }

    @Override
    public List<AssinaturaModel> listarAssinaturas(){
        return assinaturas;
    }

    @Override
    public List<AssinaturaModel> listarAssinaturasPorCodCliente(@PathVariable long codigoDoCliente){
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
