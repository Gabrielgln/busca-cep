package com.lira.busca_cep.config;

import com.lira.busca_cep.client.viacep.presentation.ViaCepApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import static com.lira.busca_cep.constant.BuscaCepConstant.VIA_CEP_API;

@Configuration
public class RestConfiguration {

    @Bean
    @Primary
    public Properties properties(){
        return new Properties();
    }

    @Bean(VIA_CEP_API)
    public ViaCepApi viaCepApi(){
        var apiClient = new com.lira.busca_cep.client.viacep.ApiClient(){
            @Override
            protected void init(){
                super.init();
                setBasePath(properties().getUrlViaCep());
            }
        };
        return new ViaCepApi(apiClient);
    }
}
