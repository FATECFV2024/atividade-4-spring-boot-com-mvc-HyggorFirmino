package com.atividade.atividade.dtos;

import com.atividade.atividade.entities.Nota;

public class NotaDTO {

    private Long id;
    private String nome_disciplina;
    private Double nota;


    public NotaDTO() {
    }

    
    public NotaDTO(Nota entity) {
        id = entity.getId();
        nome_disciplina = entity.getNome_disciplina();
        nota = entity.getNota();
    }
    

    public NotaDTO(Long id, String nome_disciplina, Double nota) {
        this.id = id;
        this.nome_disciplina = nome_disciplina;
        this.nota = nota;
    }


  public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }


    public String getNome_disciplina() {
        return nome_disciplina;
    }


    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }


    public Double getNota() {
        return nota;
    }


    public void setNota(Double nota) {
        this.nota = nota;
    }

    
}
