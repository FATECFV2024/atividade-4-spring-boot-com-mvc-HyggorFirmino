package com.atividade.atividade.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private String cidade;
    private String cep;
    private String estado;
    private int numero;

    // rua, cidade, estado e cep

    public Endereco() {
    }

    
    public Endereco(Long id, String rua, String cidade, String cep, String estado, int numero) {
        this.id = id;
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.numero = numero;
    }


  public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }


    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getCep() {
        return cep;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    
}
