package com.grupo5.monolitoclean.domain.repository;

import com.grupo5.monolitoclean.domain.entities.ClienteModel;

import java.util.List;

public interface IClienteRepository {
    ClienteModel registrarCliente(ClienteModel clienteModel);
    List<ClienteModel> listarClientes();
}
