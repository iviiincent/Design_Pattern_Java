package _17_observer;

public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver: ");
        int count = generator.getNumber();
        System.out.println("*".repeat(count));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
