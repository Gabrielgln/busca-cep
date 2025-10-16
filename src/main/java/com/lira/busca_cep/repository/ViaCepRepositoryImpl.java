package com.lira.busca_cep.repository;

import com.lira.busca_cep.client.viacep.presentation.ViaCepApi;
import com.lira.busca_cep.client.viacep.presentation.representation.EnderecoResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import static com.lira.busca_cep.constant.BuscaCepConstant.VIA_CEP_API;

@Repository
public class ViaCepRepositoryImpl implements ViaCepRepository{
    private final ViaCepApi api;

    public ViaCepRepositoryImpl(ViaCepApi api) {
        this.api = api;
    }

    @Qualifier(VIA_CEP_API)
    @Override
    public EnderecoResponse getEnderecoByCep(String cep) {
        return api.getEnderecoByCep(cep);
    }
}
