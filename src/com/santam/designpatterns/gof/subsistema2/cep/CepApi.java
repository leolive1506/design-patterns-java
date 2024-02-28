package com.santam.designpatterns.gof.subsistema2.cep;

public class CepApi {
    private static final CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCidade(String cep) {
        return "Uberlândia";
    }

    public String getEstado(String cep) {
        return "SP";
    }
}
