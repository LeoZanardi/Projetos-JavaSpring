package com.cadastrador.cadastrar_veiculos.service;
import com.cadastrador.cadastrar_veiculos.model.Veiculo;
import com.cadastrador.cadastrar_veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarVeiculos(){
        return veiculoRepository.findAll();
    }

    public Veiculo salvarVeiculos (Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }
    public Veiculo buscarVeiculoPorId(Long id) {
        return veiculoRepository.findById(id).orElse(null);
    }

    public void deletarVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }
}
