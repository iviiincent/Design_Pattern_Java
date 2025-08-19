package _10_strategy.exercise;

import _10_strategy.Player;

import static _10_strategy.Main.testGame;

public class Main {

    public static void main(String[] args) {
        testRandomStrategy();
    }

    private static void testRandomStrategy() {
        Player alpha = new Player("Alpha", new RandomStrategy(500));
        Player beta = new Player("Beta", new RandomStrategy(100));

        testGame(alpha, beta);
    }
}
