package com.cadastrador.cadastrar_veiculos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue
    private Long id;
    private String Placa;
    private String Modelo;
    private String Marca;
    private Integer AnoModelo;
    private Integer AnoFabricacao;
    private String Cor;
    private Double Preco;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Integer getAnoModelo() {
        return AnoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        AnoModelo = anoModelo;
    }

    public Integer getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }
}
