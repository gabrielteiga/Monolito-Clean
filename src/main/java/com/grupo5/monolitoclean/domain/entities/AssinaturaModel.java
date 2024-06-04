package com.grupo5.monolitoclean.domain.entities;

import com.grupo5.monolitoclean.domain.repository.StatusAssinatura;

import java.util.Date;

public class AssinaturaModel {
    private long codigo;
    private AplicativoModel aplicativo;
    private ClienteModel cliente;
    private Date inicioVigencia;
    private Date fimVigencia;

    public AssinaturaModel(long codigo, AplicativoModel aplicativo, ClienteModel cliente, Date inicioVigencia, Date fimVigencia) {
        this.codigo = codigo;
        this.aplicativo = aplicativo;
        this.cliente = cliente;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
    }

    public AssinaturaModel(){

    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public AplicativoModel getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(AplicativoModel aplicativo) {
        this.aplicativo = aplicativo;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    public String getData(){
        return getCodigo() + "," + getAplicativo() + "," + getCliente() + "," + getInicioVigencia() + "," + getFimVigencia() + "," + StatusAssinatura.ATIVA;
    }

}
