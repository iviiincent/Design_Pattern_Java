package _10_strategy;

import java.util.Random;

public class ProbStrategy implements Strategy {

    private final Random random;

    private int preHandValue = 0;

    private int currentHandValue = 0;

    private final int[][] history = {
            {1, 1, 1}, {1, 1, 1}, {1, 1, 1},
    };

    public ProbStrategy(int seed) {
        this.random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue;

        if (bet < history[currentHandValue][0]) {
            handValue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }

        preHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getHand(currentHandValue);
    }

    private int getSum(int handValue) {
        int sum = 0;
        for (int v : history[handValue]) {
            sum += v;
        }
        return sum;
    }
    
    @Override
    public void study(boolean win) {
        if (win) {
            history[preHandValue][currentHandValue] += 1;
        } else {
            history[preHandValue][(currentHandValue + 1) % 3] += 1;
            history[preHandValue][(currentHandValue + 2) % 3] += 1;
        }
    }
}
