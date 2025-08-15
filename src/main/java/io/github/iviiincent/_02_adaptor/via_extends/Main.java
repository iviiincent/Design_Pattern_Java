package io.github.iviiincent._02_adaptor.via_extends;

public class Main {

    public static void main(String[] args) {
        /*
         *  PrintBanner is adapting the Banner class to fit the Print interface.
         */
        Print p = new PrintBanner("Hello");
        p.printStrong(); // **
        p.printWeak(); // ()
    }

}
