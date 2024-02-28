package com.santam.designpatterns.gof.infra.strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Robo movendo-se defensivamente");
    }
}
