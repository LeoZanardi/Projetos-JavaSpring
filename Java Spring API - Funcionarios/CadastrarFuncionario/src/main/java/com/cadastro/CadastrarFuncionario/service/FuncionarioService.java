package com.cadastro.CadastrarFuncionario.service;
import com.cadastro.CadastrarFuncionario.model.Funcionario;
import com.cadastro.CadastrarFuncionario.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public void deletarFuncionario(int id) {
        funcionarioRepository.deleteById(id);
    }

}
