package com.cadastrador.cadastrar_veiculos.repository;

import com.cadastrador.cadastrar_veiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface VeiculoRepository extends JpaRepository <Veiculo,Long> {
}
