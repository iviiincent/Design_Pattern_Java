package io.github.iviiincent._02_adaptor.via_delegation;

public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong(); // **
        p.printWeak(); // ()
    }

}
