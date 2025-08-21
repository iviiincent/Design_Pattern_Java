package _17_observer;

public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        DigitObserver o1 = new DigitObserver();
        GraphObserver o2 = new GraphObserver();

        generator.addObserver(o1);
        generator.addObserver(o2);

        generator.execute();
    }

}
