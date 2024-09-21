package br.com.webprojeto.webproj.repository;


import br.com.webprojeto.webproj.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepo extends JpaRepository<Funcionario,String> {

}
