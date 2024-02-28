package com.santam.designpatterns.gof.infra.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Robo movendo-se agressivamente");
    }
}
