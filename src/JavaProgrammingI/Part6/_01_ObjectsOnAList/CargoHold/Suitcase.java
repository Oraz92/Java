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
            return "no items (0 kg)";
        }
        int counter = 0;
        for (Item item: this.items) {
            counter++;
        }
        if (counter < 2) {
            return this.itemCounter + " item " + "(" + totalWeight + " kg)";
        }
        return this.itemCounter + " items " + "(" + totalWeight + " kg)";
    }
}
