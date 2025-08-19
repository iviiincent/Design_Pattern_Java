package _04_factory_method.idcard;

import _04_factory_method.framework.Factory;
import _04_factory_method.framework.Product;
import lombok.Getter;

import java.util.HashMap;

@Getter
public class IDCardFactory extends Factory {

    private final HashMap<Integer, String> database = new HashMap<>();

    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());
    }
}
