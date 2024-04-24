package com.grupo5.monolitoclean.domain.entities;

public class AplicativoModel {
    private long codigo;
    private String nome;
    private float custoMensal;

    public AplicativoModel(long codigo, String nome, float custoMensal) {
        this.codigo = codigo;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(float custoMensal) {
        this.custoMensal = custoMensal;
    }
}
