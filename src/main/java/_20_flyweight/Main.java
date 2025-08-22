package _20_flyweight;

public class Main {

    public static void main(String[] args) {
        new BigString("123123", true).print();
        new BigString("123123", false).print();
    }

}
