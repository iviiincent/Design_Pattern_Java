package io.github.iviiincent._10_strategy;

public interface Strategy {

    Hand nextHand();

    void study(boolean win);
}
