package br.com.webprojeto.webproj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Funcionario {
    @Id
    private String CPF;
    private String Nome;
    private Double Salario;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getSalario() {
        return Salario;
    }

}
