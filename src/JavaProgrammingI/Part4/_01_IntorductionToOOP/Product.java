package JavaProgrammingI.Part4._01_IntorductionToOOP;

public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(double initialPrice, int initialQuantity, String productName) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = productName;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

    public static void main(String[] args) {
        Product banana = new Product(10, 20, "Banana");
        banana.printProduct();
    }
}
