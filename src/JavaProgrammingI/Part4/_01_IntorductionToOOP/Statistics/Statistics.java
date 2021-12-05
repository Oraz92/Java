package JavaProgrammingI.Part4._01_IntorductionToOOP.Statistics;

import java.util.ArrayList;

public class Statistics {
    private int count;
    private int sum;

    ArrayList<Integer> listOfNumbers = new ArrayList<>();

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int nubmer) {
        this.count++;
        listOfNumbers.add(nubmer);
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        /*for (int i = 0; i < listOfNumbers.size(); i++) {
            this.sum += listOfNumbers.get(i);
        }
*/
        for (int i : listOfNumbers) {
            this.sum += i;
        }
        return this.sum;
    }

    public double average() {
        return 1.0 * this.sum / this.count;
    }
}
