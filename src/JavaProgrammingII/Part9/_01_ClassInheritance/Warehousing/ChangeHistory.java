package JavaProgrammingII.Part9._01_ClassInheritance.Warehousing;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> historyList;

    public ChangeHistory() {
        this.historyList = new ArrayList<>();
    }

    public void add(double status) {
        this.historyList.add(status);
    }

    public void clear() {
        this.historyList.clear();
    }

    public double maxValue() {
        if (this.historyList.isEmpty()) {
            return 0;
        }
        return Collections.max(this.historyList);
    }

    public double minValue() {
        if (this.historyList.isEmpty()) {
            return 0;
        }
        return Collections.min(this.historyList);
    }

    public double average() {
        if (this.historyList.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double item : this.historyList) {
            sum += item;
        }
        return sum / this.historyList.size();
    }

    @Override
    public String toString() {
        return this.historyList.toString();
    }
}
