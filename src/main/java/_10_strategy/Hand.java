package _10_strategy;

public enum Hand {
    Scissors, Paper, Rock;

    public boolean isStrongerThan(Hand other) {
        return (1 + this.ordinal()) % 3 == other.ordinal();
    }

    public static Hand getHand(int value) {
        return Hand.values()[Math.floorMod(value, 3)];
    }
}
