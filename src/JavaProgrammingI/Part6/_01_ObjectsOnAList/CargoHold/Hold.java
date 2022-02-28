package JavaProgrammingI.Part6._01_ObjectsOnAList.CargoHold;

import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int countOfSuitcases;
    private int totalSuitcasesWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.countOfSuitcases = 0;
        this.totalSuitcasesWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        /*
        int checkSuitcasesWeight = 0;
        for (Suitcase tempSuitcase: this.suitcases) {
            checkSuitcasesWeight += tempSuitcase.totalWeight(); // Counting sum of all suitcases weight
        }*/

        // Alternative using stream methods with lambda expressions
        /*int checkSuitcasesWeight = (int) this.suitcases.stream()
                .map(tempSuitcase -> tempSuitcase.totalWeight())
                .reduce(0, (previousSum, tempSuitcase) -> previousSum + tempSuitcase);*/

        // Alternative using stream methods with method references
        int checkSuitcasesWeight = this.suitcases.stream()
                .map(Suitcase::totalWeight)
                .reduce(0, Integer::sum);

        this.totalSuitcasesWeight = checkSuitcasesWeight + suitcase.totalWeight(); // all suitcases weight + adding suitcase's weight
        if (this.totalSuitcasesWeight <= this.maxWeight) {
            suitcases.add(suitcase);
            countOfSuitcases++;
        } else {
            this.totalSuitcasesWeight -= suitcase.totalWeight();
        }
    }

    public void printItems() {
        suitcases.forEach(Suitcase::printItems);
        // suitcases.stream().forEach(suitcase -> suitcase.printItems());

        /*for (Suitcase tempCase: suitcases) {
            tempCase.printItems();
        }*/
    }

    public String toString() {
        return this.countOfSuitcases + " suitcases (" + this.totalSuitcasesWeight + " kg)";
    }
}
