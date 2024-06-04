package com.grupo5.monolitoclean.repository;

import com.grupo5.monolitoclean.domain.entities.AplicativoModel;
import com.grupo5.monolitoclean.domain.repository.IAplicativoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AplicativoMemRepository implements IAplicativoRepository {
    private List<AplicativoModel> listaDeAplicativos;

    public AplicativoMemRepository(List<AplicativoModel> listaDeAplicativos) {
        this.listaDeAplicativos = listaDeAplicativos;
    }

    public AplicativoModel registrarAplicativo(AplicativoModel aplicativo){
        listaDeAplicativos.add(aplicativo);
        return aplicativo;
    }

    public List<AplicativoModel> listarAplicativos(){
        return listaDeAplicativos;
    }

    public AplicativoModel atualizarCustoMensal(long aplicativoId, float custoMensal){
        for(AplicativoModel aplicativo : listaDeAplicativos){
            if(aplicativo.getCodigo() == aplicativoId){
                aplicativo.setCustoMensal(custoMensal);
                return aplicativo;
            }
        }
        return null;
    }
}
