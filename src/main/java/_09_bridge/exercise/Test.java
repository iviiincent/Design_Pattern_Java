package _09_bridge.exercise;

import _09_bridge.CountDisplay;
import _09_bridge.StringDisplayImpl;

public class Test {

    public static void testRandomDisplay() {
        RandomDisplay display = new RandomDisplay(new StringDisplayImpl("Testing RandomDisplay"));
        display.randomDisplay(4);
    }

    public static void testCoundDisplay() {
        CountDisplay d = new CountDisplay(new FileDisplayImpl("text.txt"));
        d.multiDisplay(4);
    }

    public static void testPatternDisplay() {
        IncreaseDisplay display = new IncreaseDisplay(new CharDisplayImpl('|', '#', '>'), 2);
        display.increaseDisplay(4);
    }

    public static void main(String[] args) {
        testRandomDisplay();
        testCoundDisplay();
        testPatternDisplay();
    }
}
