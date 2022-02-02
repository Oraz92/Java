package JavaProgrammingII.Part9._02_Interfaces.OnlineShop;

import java.util.*;

public class ShoppingCart {

    private Map<String, Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.shoppingCart.containsKey(product)) { // if product already in a shopping cat, just increase quantity
            Item item = this.shoppingCart.get(product);
            item.increaseQuantity();
        } else {
            Item item = new Item(product, price); // else, new product will be added to cart, quantity = 1
            this.shoppingCart.put(product, item);
        }
    }

    public int price() {
        int price = 0;
        for (Item item: this.shoppingCart.values()) {
            price += item.price();
        }
        return price;
    }
    public void print() {
        for (Item item: this.shoppingCart.values()) {
            System.out.println(item);
        }
    }
}
