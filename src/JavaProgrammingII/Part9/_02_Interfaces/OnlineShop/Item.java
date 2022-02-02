package JavaProgrammingII.Part9._02_Interfaces.OnlineShop;

import java.util.HashMap;

public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int quantity, int unitPrice) {
        this(product, unitPrice);
        this.quantity = quantity;
    }

    public Item(String product, int unitPrice) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = 1;
    }

    public int price() {
        return this.quantity * this.unitPrice;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }
}
