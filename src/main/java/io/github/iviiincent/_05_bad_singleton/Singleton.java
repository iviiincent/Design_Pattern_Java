package io.github.iviiincent._05_bad_singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
        System.out.println("Calling Singleton()");
        slowdown();
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
