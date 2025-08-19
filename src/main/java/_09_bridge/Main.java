package _09_bridge;

public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, Asia."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, World."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(3);
    }
}
