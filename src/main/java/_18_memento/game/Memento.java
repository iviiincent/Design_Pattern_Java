package _18_memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {

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
