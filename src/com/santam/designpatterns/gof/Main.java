package com.santam.designpatterns.gof;

import com.santam.designpatterns.gof.infra.singleton.SingletonEager;
import com.santam.designpatterns.gof.infra.singleton.SingletonLazy;
import com.santam.designpatterns.gof.infra.singleton.SingletonLazyHolder;

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

    }
}