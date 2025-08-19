package _10_strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private final Random random;

    private boolean won = false;

    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
        prevHand = Hand.getHand(random.nextInt());
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt());
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
