package JavaProgrammingII.Part9._01_ClassInheritance.Warehousing;

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance += amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0;
        }
        if (amount > this.balance) {
            double allInWarehouse = this.balance;
            this.balance = 0;
            return allInWarehouse;
        }

        this.balance -= amount;
        return this.balance;
    }

    @Override
    public String toString() {
        return "balance = " + this.balance + ", space left " + this.howMuchSpaceLeft();
    }
}