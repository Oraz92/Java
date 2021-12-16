package JavaProgrammingI.Part6._01_ObjectsOnAList.CargoHold;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxTotalWeight;
    private int totalWeight;
    private int itemCounter;

    public Suitcase(int maxTotalWeight) {
        this.items = new ArrayList<>();
        this.maxTotalWeight = maxTotalWeight;
        this.itemCounter = 0;
        this.totalWeight = 0;
    }

    public void addItem(Item item) {
        int checkWeight = 0;
        for (Item i: items) {
            checkWeight += i.getWeight(); // Counting sum of all items weight
        }
        this.totalWeight = checkWeight + item.getWeight(); // all items weight + adding item's weight
        if (this.totalWeight <= this.maxTotalWeight) {
            items.add(item);
            itemCounter++;
        } else {
            this.totalWeight -= item.getWeight();
        }
    }

    public String toString() {
        if (items.isEmpty()) {
            return this.itemCounter + " items " + "( " + totalWeight + " kg)";
        }
        return this.itemCounter + " items " + "( " + totalWeight + " kg)";
    }
}
