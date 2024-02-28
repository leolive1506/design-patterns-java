package com.santam.designpatterns.gof.infra.facede;

import com.santam.designpatterns.gof.subsistema1.crm.CrmService;
import com.santam.designpatterns.gof.subsistema2.cep.CepApi;

/**
 * problema: base de cliente e quer fazer migração para uma nova base ou incrementar a base atual
 * base cliente tem: nome e cep
 * a partir facede que tem, consumir api de cep e consolide as informações
 */
public class Facede {
    public void migrarCliente(String nome, String cep) {
        var cidade = CepApi.getInstance().getCidade(cep);
        var estado = CepApi.getInstance().getEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
