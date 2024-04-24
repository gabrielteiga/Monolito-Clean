package com.grupo5.monolitoclean.domain.entities;

import java.math.BigDecimal;
import java.util.Date;

public class PagamentoModel {
    private long codigo;
    private AssinaturaModel assinatura;
    private BigDecimal valorPago;
    private Date dataPagamento;
    private String promocao;

    public long getCodigo() {
        return codigo;
    }

    public PagamentoModel(long codigo, AssinaturaModel assinatura, BigDecimal valorPago, Date dataPagamento, String promocao) {
        this.codigo = codigo;
        this.assinatura = assinatura;
        this.valorPago = valorPago;
        this.dataPagamento = dataPagamento;
        this.promocao = promocao;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public AssinaturaModel getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(AssinaturaModel assinatura) {
        this.assinatura = assinatura;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }
}
