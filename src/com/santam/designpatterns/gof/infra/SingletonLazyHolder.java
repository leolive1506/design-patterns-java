package com.santam.designpatterns.gof.infra;

/**
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static final SingletonLazyHolder singletonLazyHolder = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.singletonLazyHolder;
    }
}
