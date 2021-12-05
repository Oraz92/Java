package JavaProgrammingI.Part4._01_IntorductionToOOP;

public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (this.value < 5) {
            this.value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            this.value--;
        }
    }

    public int getValue() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }

    public static void main(String[] args) {
        Gauge gauge = new Gauge();
        gauge.increase();
        System.out.println(gauge.getValue());
        gauge.decrease();
        System.out.println(gauge.getValue());
        gauge.decrease();
        System.out.println(gauge.full());
    }
}
