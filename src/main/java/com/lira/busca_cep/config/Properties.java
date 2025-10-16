package com.lira.busca_cep.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("client")
@Configuration
public class Properties {
    public String getUrlViaCep() {
        return urlViaCep;
    }

    public void setUrlViaCep(String urlViaCep) {
        this.urlViaCep = urlViaCep;
    }

    private String urlViaCep;
}
