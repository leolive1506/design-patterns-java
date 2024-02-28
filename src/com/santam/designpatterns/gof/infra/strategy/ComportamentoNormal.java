package com.santam.designpatterns.gof.infra.strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Robo movendo-se normalmente");
    }
}
