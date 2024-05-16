package com.atividade.atividade.dtos;

import com.atividade.atividade.entities.Endereco;

public class EnderecoDTO {

    private Long id;
    private String rua;
    private String cidade;
    private String cep;
    private String estado;
    private int numero;


    public EnderecoDTO() {
    }

    
    public EnderecoDTO(Endereco entity) {
        id = entity.getId();
        rua = entity.getRua();
        cidade = entity.getCidade();
        cep = entity.getCep();
        estado = entity.getEstado();
        numero = entity.getNumero();
    }
    

    public EnderecoDTO(Long id, String rua, String cidade, String cep, String estado, int numero) {
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
