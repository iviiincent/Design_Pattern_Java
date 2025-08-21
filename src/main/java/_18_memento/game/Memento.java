package _18_memento.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable {
    int money;

    final List<String> fruits = new ArrayList<>();

    Memento(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

}
