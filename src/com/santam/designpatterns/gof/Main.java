package com.santam.designpatterns.gof;

import com.santam.designpatterns.gof.infra.singleton.SingletonEager;
import com.santam.designpatterns.gof.infra.singleton.SingletonLazy;
import com.santam.designpatterns.gof.infra.singleton.SingletonLazyHolder;
import com.santam.designpatterns.gof.infra.strategy.*;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        System.out.println();


        // strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
    }
}
