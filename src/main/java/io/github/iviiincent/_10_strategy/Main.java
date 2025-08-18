package io.github.iviiincent._10_strategy;

public class Main {

    public static void main(String[] args) {
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player alpha = new Player("Alpha", new WinningStrategy(seed1));
        Player beta = new Player("Beta", new ProbStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand handA = alpha.nextHand();
            Hand handB = beta.nextHand();

            if (handA.isStrongerThan(handB)) {
                System.out.println("Round " + (i + 1) + ": winner is " + alpha);
                alpha.win();
                beta.lose();
            } else if (handB.isStrongerThan(handA)) {
                System.out.println("Round " + (i + 1) + ": winner is " + beta);
                alpha.lose();
                beta.win();
            } else {
                System.out.println("Round " + (i + 1) + ": even");
                alpha.even();
                beta.even();
            }
        }

        System.out.println("Final result:");
        System.out.println(alpha);
        System.out.println(beta);
    }

}
