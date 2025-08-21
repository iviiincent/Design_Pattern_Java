package _17_observer;

public class IncrementalNumberGenerator extends NumberGenerator {

    private final int destination;

    private final int step;

    private int current;

    public IncrementalNumberGenerator(int initial, int destination, int step) {
        this.current = initial;
        this.destination = destination;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return current;
    }

    @Override
    public void execute() {
        while (current <= destination) {
            notifyObservers();
            current += step;
        }
    }
}
