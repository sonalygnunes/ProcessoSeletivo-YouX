package com.example.demo.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "Tb_enfermeiro")

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
