package _12_decorator;

import _12_decorator.decorator.FullBorder;
import _12_decorator.decorator.SideBorder;
import _12_decorator.decorator.UpDownBorder;

public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay(" hello, world ");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b1);

        b1.show();
        b2.show();
        b3.show();

        Display display = new SideBorder(new FullBorder(new FullBorder(new FullBorder(b3))), '/');

        display.show();
        testUpDownBorder(display);
        testMultiStringDisplay();
    }

    private static void testUpDownBorder(Display display) {
        new UpDownBorder(display, '@').show();
    }

    private static void testMultiStringDisplay() {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("abc");
        md.add("ed");
        md.add("ghi");

        md.show();
        new SideBorder(new FullBorder(md), '^').show();
    }
}
