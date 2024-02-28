package com.santam.designpatterns.gof.subsistema1.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema CRM");
        System.out.println(nome);
        System.out.println(estado);
        System.out.println(cidade);
    }

}

