package JavaProgrammingII.Part9._02_Interfaces.OnlineShop;

import java.util.HashMap;

public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int quantity, int unitPrice) {
        this(product, unitPrice);
        //this.product = product;
        //this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Item(String product, int unitPrice) {
        this.product = product;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return getQuantity() * this.unitPrice;
    }

    public int getQuantity() {
        if (this.quantity == 0) {
            return 1;
        }
        return this.quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.quantity;
    }
}
