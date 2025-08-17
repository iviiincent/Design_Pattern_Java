package io.github.iviiincent._06_prototype;

import io.github.iviiincent._06_prototype.framework.Product;

public class MessageBox implements Product {

    private final char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();

        System.out.println(decochar + " " + s + " " + decochar);

        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return product;
    }
}
