package _18_memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {

    private final static String[] FRUITS = {
            "apple", "banana", "orange", "durian"
    };

    private int money;

    private List<String> fruits = new ArrayList<>();

    private final Random random = new Random();

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(1, 7);
        switch (dice) {
            case 1:
                money += 100;
                System.out.println("Money increased.");
                break;
            case 2:
                money /= 2;
                System.out.println("Money cut off.");
                break;
            case 6:
                String fruit = getFruit();
                if (fruit.startsWith("delicious ")) {
                    fruits.add(fruit);
                    System.out.println(fruit + " added.");
                }
                break;
            default:
                System.out.println("nothing happens.");
                break;
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("delicious ")) {
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }

    public String getFruit() {
        StringBuffer buffer = new StringBuffer();
        if (random.nextBoolean()) {
            buffer.append("delicious ");
        }
        return buffer.append(FRUITS[random.nextInt(4)]).toString();
    }
}
