package JavaProgrammingII.Part9._02_Interfaces.OnlineShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);
        //System.out.println("cart price: " + cart.price());
        cart.add("computer", 899);
        int price = cart.price();
        System.out.println(price);
        cart.print();*/
        //--------------------------------------------------------
        /*ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");*/
        //------------------------------------------------------------
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}
