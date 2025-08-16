package io.github.iviiincent._05_bad_singleton;

public class Main extends Thread {

    public Main(String name) {
        super(name);
    }

    public static void main(String[] args) {
        System.out.println("> Main.main() starts.");

        new Main("a").start();
        new Main("b").start();
        new Main("c").start();

        System.out.println("> Main.main() ends.");
    }

    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(getName() + ", singleton object is: " + s);
    }
}
