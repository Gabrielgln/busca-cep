package com.lira.busca_cep.repository;

import com.lira.busca_cep.client.viacep.presentation.representation.EnderecoResponse;

public interface ViaCepRepository {
    EnderecoResponse getEnderecoByCep(String cep);
}
