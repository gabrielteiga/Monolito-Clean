package com.grupo5.monolitoclean.repository;

import com.grupo5.monolitoclean.domain.entities.ClienteModel;
import com.grupo5.monolitoclean.domain.repository.IClienteRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteMemRepository implements IClienteRepository {
    private List<ClienteModel> clientes;

    public ClienteMemRepository() {
        clientes = new ArrayList<>();
        clientes.add(new ClienteModel(1, "João", "joao@hotmail.com"));
        clientes.add(new ClienteModel(2, "Maria", "maria@hotmail.com"));
    }

    public ClienteModel registrarCliente(ClienteModel clienteModel){
        clientes.add(clienteModel);
        return clienteModel;
    }
    public List<ClienteModel> listarClientes(){
        return clientes;
    }
}
