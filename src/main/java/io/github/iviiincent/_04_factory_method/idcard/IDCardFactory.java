package io.github.iviiincent._04_factory_method.idcard;

import io.github.iviiincent._04_factory_method.framework.Factory;
import io.github.iviiincent._04_factory_method.framework.Product;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class IDCardFactory extends Factory {

    private final List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }
}
