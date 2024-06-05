package com.grupo5.monolitoclean.domain.services;

import com.grupo5.monolitoclean.domain.entities.ClienteModel;
import com.grupo5.monolitoclean.domain.repository.IClienteRepository;

import java.util.List;

public class ClienteService {
    private IClienteRepository clienteRepository;

    public ClienteService(IClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteModel> clientesCadastrados(){
        return clienteRepository.listarClientes(); //NÃO ENTENDI O ERRO
        //tinha um parênteses depois do clienteRepository
    }
}
