package br.com.banco.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTA")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CONTA")
    private Integer id_conta;
    
    @Column(name="NOME_RESPONSAVEL")
    private String nome_responsavel;

    public Integer getId_conta() {
        return id_conta;
    }

    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setId_conta(Integer id_conta) {
        this.id_conta = id_conta;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String toString() {
        return super.toString();
    }

    public int hashCode() {
        return super.hashCode();
    }
    
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
