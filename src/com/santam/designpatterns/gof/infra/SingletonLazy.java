package com.santam.designpatterns.gof.infra;

// num primeiro momento não disponibiliza a instancia para usuaŕio
public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    // para não permitir que ninguem instancie
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }

        return singletonLazy;
    }
}
