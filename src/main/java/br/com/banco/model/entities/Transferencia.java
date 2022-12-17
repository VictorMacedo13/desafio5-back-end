package br.com.banco.model.entities;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import br.com.banco.model.enums.Tipo;

// @Entity
// @Table(name="TRANSFERENCIA")
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @CreatedDate
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    protected ZonedDateTime data_transferencia;

    private BigDecimal valor;

    @Enumerated(EnumType.ORDINAL)
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name="NOME_OPERADOR_TRANSACAO")
    private Conta nome_operado_transacao;

    @ManyToOne
    @JoinColumn(name="CONTA_ID")
    private Conta conta_id;

    public Conta getConta_id() {
        return conta_id;
    }
    public ZonedDateTime getData_transferencia() {
        return data_transferencia;
    }
    public Integer getId() {
        return id;
    }
    public Conta getNome_operado_transacao() {
        return nome_operado_transacao;
    }public Tipo getTipo() {
        return tipo;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setConta_id(Conta conta_id) {
        this.conta_id = conta_id;
    }
     void setData_transferencia(ZonedDateTime data_transferencia) {
        this.data_transferencia = data_transferencia;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setNome_operado_transacao(Conta nome_operado_transacao) {
        this.nome_operado_transacao = nome_operado_transacao;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public int hashCode() {
        return super.hashCode();
    }
    public String toString() {
        return super.toString();
    }
}
