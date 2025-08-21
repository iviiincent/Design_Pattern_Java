package _18_memento;

import _18_memento.game.Gamer;
import _18_memento.game.Memento;

import java.io.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class Main {

    public static final String SAVE_FILENAME = "game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if (memento != null) {
            System.out.println("Saved from last game.");
            gamer.restoreMemento(memento);
        } else {
            memento = gamer.createMemento();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("> Round " + i);
            System.out.println(gamer);

            gamer.bet();
            System.out.println("Current money " + gamer.getMoney());

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("Saved");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("Drop");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }

    /**
     * Returns previous game status, or null if there's not such file.
     */
    private static Memento loadMemento() {
        Memento memento = null;

        try (
                ObjectInput input = new ObjectInputStream(new InflaterInputStream(new FileInputStream(SAVE_FILENAME)))
        ) {
            memento = (Memento) input.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found -> new game.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return memento;
    }

    private static void saveMemento(Memento memento) {
        try (
                ObjectOutput output = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(SAVE_FILENAME)))
        ) {
            output.writeObject(memento);
            output.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
