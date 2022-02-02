package JavaProgrammingII.Part9._02_Interfaces.OnlineShop;

import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection: ");

        for (String product: this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }

            int price = this.warehouse.price(product); // getting the price parameter of product
            if (this.warehouse.take(product)) { // taking and at the same time taking element from stock
                cart.add(product, price);
            }
        }

        System.out.println("Your shopping contents: ");
        cart.print();
        System.out.println("Total price: " + cart.price());
    }


}
