package _05_singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Calling Singleton()");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
