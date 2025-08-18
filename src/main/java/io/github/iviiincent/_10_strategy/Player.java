package io.github.iviiincent._10_strategy;

public class Player {

    private final String name;
    private final Strategy strategy;

    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount += 1;
        gameCount += 1;
    }

    public void lose() {
        strategy.study(false);
        loseCount += 1;
        gameCount += 1;
    }

    public void even() {
        gameCount += 1;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy.getClass().getSimpleName() +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
