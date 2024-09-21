package br.com.webprojeto.webproj.controller;

import br.com.webprojeto.webproj.entity.Funcionario;
import br.com.webprojeto.webproj.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/")
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.findAll();
    }

    @PostMapping("/Cadastrados")
    public Funcionario salvarFuncionario(@RequestBody Funcionario funcionario) {
        return funcionarioService.salvar(funcionario);
    }

    @PutMapping("/edit/{id}")
    public Funcionario atualizarFuncionario(@PathVariable String cpf, @RequestBody Funcionario funcionario) {
        return funcionarioService.atualizar(cpf, funcionario);
    }

    @DeleteMapping("/delete/{id}")
    public void deletarFuncionario(@PathVariable String cpf) {
        funcionarioService.deletar(cpf);
    }
}