package _20_flyweight;

public class Main {

    private static final BigString[] bigStrings = new BigString[10000];

    public static void main(String[] args) {
        testAllocation(false);
        testAllocation(true);
    }

    public static void testAllocation(boolean shared) {
        for (int i = 0; i < bigStrings.length; i++) {
            bigStrings[i] = new BigString("123123", shared);
        }
        showMemory();
    }

    private static void showMemory() {
        Runtime.getRuntime().gc();
        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
    }

}
