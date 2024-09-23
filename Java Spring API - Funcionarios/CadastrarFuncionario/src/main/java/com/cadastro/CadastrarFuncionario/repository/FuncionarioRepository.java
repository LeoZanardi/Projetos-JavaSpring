package com.cadastro.CadastrarFuncionario.repository;

import com.cadastro.CadastrarFuncionario.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository <Funcionario,Integer> {
}
