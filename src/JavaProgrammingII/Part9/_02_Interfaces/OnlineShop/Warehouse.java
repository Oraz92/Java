package JavaProgrammingII.Part9._02_Interfaces.OnlineShop;

import java.util.*;

public class Warehouse {

    private Map<String, Integer> productPriceList;
    private Map<String, Integer> productStockList;

    public Warehouse() {
        this.productPriceList = new HashMap<>();
        this.productStockList = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPriceList.put(product, price);
        this.productStockList.put(product, stock);
    }

    public int price(String product) {
        if (this.productPriceList.containsKey(product)) {
            return this.productPriceList.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.productStockList.containsKey(product)) {
            return this.productStockList.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.productStockList.containsKey(product)) {
            int quantityOfProduct = this.productStockList.get(product);
            if (quantityOfProduct > 0) {
                quantityOfProduct--;
                this.productStockList.put(product, quantityOfProduct);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return new HashSet<>(this.productPriceList.keySet());
    }
}
