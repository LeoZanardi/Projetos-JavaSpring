package br.com.webprojeto.webproj.service;

import br.com.webprojeto.webproj.entity.Funcionario;
import br.com.webprojeto.webproj.repository.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
@Autowired
    private FuncionarioRepo funcionarioRepo;
    //listar os funcionarios
    public List<Funcionario> findAll() {
        return funcionarioRepo.findAll();
    }
    //salvar dados de um funcionario
    public Funcionario salvar(Funcionario funcionario) {
        return funcionarioRepo.save(funcionario);
    }

    // atualizar dados de um funcionário
    public Funcionario atualizar(String cpf, Funcionario funcionario) {
        if (funcionarioRepo.existsById(cpf)) {
            funcionario.setCPF(cpf);
            return funcionarioRepo.save(funcionario);
        }
        return null; // ou lance uma exceção
    }

    //deletar um funcionário
    public void deletar(String cpf) {
        funcionarioRepo.deleteById(cpf);
    }
}

