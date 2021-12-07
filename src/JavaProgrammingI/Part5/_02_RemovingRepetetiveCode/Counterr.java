package JavaProgrammingI.Part5._02_RemovingRepetetiveCode;

public class Counterr {
    private int value;

    public Counterr() {
        this.value = 0;
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

}
