package JavaProgrammingII.Part9._01_ClassInheritance.Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }


    public String history() {
        return this.changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double result = super.getBalance() - amount;
        this.changeHistory.add(result);
        return super.takeFromWarehouse(amount);

        /*if (super.getBalance() < amount) {
            this.changeHistory.add(super.getBalance());
            return super.getBalance();
        }
        super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());

        return super.getBalance();*/
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName() + "\n" +
                        "History: " + history() + "\n" +
                        "Largest amount of product: " + this.changeHistory.maxValue() + "\n" +
                        "Smallest amount of product: " + this.changeHistory.minValue() + "\n" +
                        "Average: " + this.changeHistory.average()
        );
    }

}
