package com.cadastro.CadastrarFuncionario.controller;
import com.cadastro.CadastrarFuncionario.model.Funcionario;
import com.cadastro.CadastrarFuncionario.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario) {
        return funcionarioService.salvarFuncionario(funcionario);
    }

    @GetMapping
    public List<Funcionario> listar() {
        return funcionarioService.listarFuncionarios();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        funcionarioService.deletarFuncionario(id);
        return ResponseEntity.noContent().build();
    }
}