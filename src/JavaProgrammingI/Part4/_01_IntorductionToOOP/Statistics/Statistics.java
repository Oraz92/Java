package JavaProgrammingI.Part4._01_IntorductionToOOP.Statistics;

public class Statistics {
    private int count;

    public Statistics() {
        this.count = 0;
    }

    public void addNumber(int nubmer) {
        this.count += nubmer;
    }

    public int getCount() {
        return this.count;
    }
}
