package _18_memento;

import _18_memento.game.Gamer;
import _18_memento.game.Memento;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 20; i++) {
            System.out.println("> Round " + i);
            System.out.println(gamer);

            gamer.bet();
            System.out.println("Current money " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("Saved");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("Drop");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }

}
