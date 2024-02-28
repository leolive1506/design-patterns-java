package com.santam.designpatterns.gof.infra;

// singlaton "apressado"
public class SingletonEager {
    private static final SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
