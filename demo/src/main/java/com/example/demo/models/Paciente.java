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
@Table(name = "Tb_paciente")
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long cpf;

    private String nome;
    private String uf;
    private String nascimento;
    private double altura;
    private double peso;

    public Paciente(Long cpf, String nome, String uf, String nascimento, double altura, double peso) {
        this.cpf = cpf;
        this.nome = nome;
        this.uf = uf;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public Paciente() {

    }
}