package com.example.demo.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@EqualsAndHashCode

public class Enfermeiro implements Serializable {

    private static final long serialVersionId = 1L;

    @Id
    private Long cpf;
    private String nome;

    public Enfermeiro(Long cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public Enfermeiro() {

    }
}
