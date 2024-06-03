package com.grupo5.monolitoclean.domain.repository;

import com.grupo5.monolitoclean.domain.entities.ClienteModel;

import java.util.List;

public interface ICliente {
    ClienteModel registrarCliente();
    List<ClienteModel> listarClientes();
}
