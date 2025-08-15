package io.github.iviiincent._04_factory_method.idcard;

import io.github.iviiincent._04_factory_method.framework.Product;
import lombok.Getter;

@Getter
public class IDCard extends Product {

    private final String owner;

    /**
     * Not using public prevents outside program generating instance.
     * Force using factory.
     */
     IDCard(String owner) {
        System.out.println("Making " + owner + "'s ID card.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Making " + owner + "'s ID card.");
    }

}
