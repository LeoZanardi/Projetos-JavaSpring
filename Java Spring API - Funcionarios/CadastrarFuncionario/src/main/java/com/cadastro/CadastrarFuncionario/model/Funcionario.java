package com.cadastro.CadastrarFuncionario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue
    private int id;
    private String Descricao;
    private LocalDate Dt_Cadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDt_Cadastro() {
        return Dt_Cadastro;
    }


    public void setDt_Cadastro(LocalDate dt_Cadastro) {
        Dt_Cadastro = dt_Cadastro;
    }
}
