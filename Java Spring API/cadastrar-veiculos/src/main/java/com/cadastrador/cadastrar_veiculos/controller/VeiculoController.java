package com.cadastrador.cadastrar_veiculos.controller;

import com.cadastrador.cadastrar_veiculos.model.Veiculo;
import com.cadastrador.cadastrar_veiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {
///propriedades da tabela H2 estão na application.properties!!
    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo criar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvarVeiculos(veiculo);
    }

    @GetMapping
    public List<Veiculo> listar() {
        return veiculoService.listarVeiculos();
    }

    @DeleteMapping("/{id}")///para puxar um dado do banco , substitua o {id} pelo numero.
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        veiculoService.deletarVeiculo(id);
        return ResponseEntity.noContent().build();
    }
}

