package JavaProgrammingII.Part8._01_ShortRecap.LiquidContainers2;

public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount >= 100) {
            this.amount = 100;
        } else if (this.amount + amount <= 100) {
            this.amount += amount;
        } else {
            this.amount = 100;
        }
    }

    public void remove(int amount) {
        if (amount >= this.amount) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
    }

    public String toString() {
        return this.amount + "/100";
    }
}
