package _04_factory_method;

import _04_factory_method.framework.Factory;
import _04_factory_method.framework.Product;
import _04_factory_method.idcard.IDCardFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();

        Product card1 = factory.create("a");
        Product card2 = factory.create("b");
        Product card3 = factory.create("c");

        card1.use();
        card2.use();
        card3.use();
    }
}
