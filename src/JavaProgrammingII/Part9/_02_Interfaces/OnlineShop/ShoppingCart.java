package JavaProgrammingII.Part9._02_Interfaces.OnlineShop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        Item item = new Item(product, price);
        this.shoppingCart.put(product, item);
    }

    public int price() {
        int price = 0;
        for (Item item: this.shoppingCart.values()) {
            price += item.price();
        }
        return price;
    }
}
