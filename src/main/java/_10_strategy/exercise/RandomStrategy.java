package _10_strategy.exercise;

import _10_strategy.Hand;
import _10_strategy.Strategy;

import java.util.Random;

public class RandomStrategy implements Strategy {

    private final Random random;

    public RandomStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt());
    }

    @Override
    public void study(boolean win) {
    }
}
