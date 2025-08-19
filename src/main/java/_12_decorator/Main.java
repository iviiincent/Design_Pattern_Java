package _12_decorator;

import _12_decorator.decorator.FullBorder;
import _12_decorator.decorator.SideBorder;

public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay(" hello, world ");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b1);

        b1.show();
        b2.show();
        b3.show();

        new SideBorder(new FullBorder(new FullBorder(new FullBorder(b3))), '#').show();
    }

}
