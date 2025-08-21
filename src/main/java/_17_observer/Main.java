package _17_observer;

public class Main {

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        System.out.println("> random");
        NumberGenerator generator = new RandomNumberGenerator();
        DigitObserver o1 = new DigitObserver();
        GraphObserver o2 = new GraphObserver();

        generator.addObserver(o1);
        generator.addObserver(o2);

        generator.execute();
    }

    private static void test2() {
        System.out.println("> incremental");
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 25);
        
        DigitObserver o1 = new DigitObserver();
        GraphObserver o2 = new GraphObserver();

        generator.addObserver(o1);
        generator.addObserver(o2);

        generator.execute();
    }

}
