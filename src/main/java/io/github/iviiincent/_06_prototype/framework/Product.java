package io.github.iviiincent._06_prototype.framework;

public abstract class Product implements Cloneable {

    public abstract void use(String s);

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
