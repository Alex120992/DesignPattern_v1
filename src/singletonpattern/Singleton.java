package singletonpattern;

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton newInstance() {
        if (singleton == null) singleton = new Singleton();
        return singleton;
    }
}
