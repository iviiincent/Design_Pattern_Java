package _02_adaptor.via_extends;

import _02_adaptor.Banner;

/**
 * Adapter
 * <p>
 * Key: it extends an adaptee
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
