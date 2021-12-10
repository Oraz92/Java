package JavaProgrammingI.Part5._02_RemovingRepetetiveCode;

public class Counterr implements Cloneable {
    private int value;

    public Counterr() {
        this(0);
    }

    public Counterr(int initialValue) {
        this.value = initialValue;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseBy) {
        this.value += increaseBy;
    }

    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }

    public void decrease() {
        this.value--;
    }

    public Counterr clone() {
        Counterr counter = null;
        try {
            counter = (Counterr) super.clone();
            //counter.value = this.value.clone();
            return counter;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return counter;
    }


    public String toString() {
        return "value: " + value;
    }

    public static void main(String[] args) {
        Counterr counter = new Counterr();
        counter.increase();
        counter.increase();

        System.out.println(counter);         // prints 2
        Counterr clone = counter.clone();

        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase();

        System.out.println(counter);         // prints 6
        System.out.println(clone);           // prints 2

    }

}
