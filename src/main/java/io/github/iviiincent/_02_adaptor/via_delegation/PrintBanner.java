package io.github.iviiincent._02_adaptor.via_delegation;

import io.github.iviiincent._02_adaptor.Banner;

/**
 * Adapter
 * <p>
 * Key: it has an adaptee
 * it's more flexible as it can adapt multiply adaptees
 */
public class PrintBanner extends Print {

    public Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
