package com.grupo5.monolitoclean.repository;

import com.grupo5.monolitoclean.domain.entities.PagamentoModel;
import com.grupo5.monolitoclean.domain.repository.IPagamentoRepository;

import java.util.ArrayList;
import java.util.List;

public class PagamentoMemRepository implements IPagamentoRepository {
    private List<PagamentoModel> pagamentos;

    public PagamentoMemRepository(){
        pagamentos = new ArrayList<PagamentoModel>();
    }

    public void registrarPagamento(PagamentoModel pagamentoModel){
        pagamentos.add(pagamentoModel);
    }
}
