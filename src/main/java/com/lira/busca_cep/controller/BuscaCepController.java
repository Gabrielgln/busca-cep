package com.lira.busca_cep.controller;


import com.lira.busca_cep.client.viacep.presentation.representation.EnderecoResponse;
import com.lira.busca_cep.repository.ViaCepRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("busca-cep")
public class BuscaCepController {
    private final ViaCepRepository repository;

    public BuscaCepController(ViaCepRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{cep}")
    public ResponseEntity<EnderecoResponse> getEndereco(@PathVariable String cep){
        return ResponseEntity.ok(repository.getEnderecoByCep(cep));
    }
}