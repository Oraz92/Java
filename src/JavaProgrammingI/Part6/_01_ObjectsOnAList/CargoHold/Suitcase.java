package JavaProgrammingI.Part6._01_ObjectsOnAList.CargoHold;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

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
        int checkWeight = items.stream().map(Item::getWeight)
                .reduce(0, Integer::sum);

        /*int checkWeight = items.stream().map(i -> i.getWeight())
                .reduce(0, (previousSum, value) -> previousSum + value);*/

        /*int checkWeight = 0;
        for (Item i: items) {
            checkWeight += i.getWeight(); // Counting sum of all items weight
        }*/
        this.totalWeight = checkWeight + item.getWeight(); // all items weight + adding item's weight
        if (this.totalWeight <= this.maxTotalWeight) {
            items.add(item);
            itemCounter++;
        } else {
            this.totalWeight -= item.getWeight();
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        return items.stream().max(Comparator.comparing(Item::getWeight)).get();
        /*Item tempItem = items.get(0);
        for (Item item: items) {
            if (tempItem.getWeight() < item.getWeight()) {
                tempItem = item;
            }
        }
        return tempItem;*/
    }

    public void printItems() {
        items.forEach(System.out::println);
        // items.forEach(item -> System.out.println(item));
        // items.stream().forEach(item -> System.out.println(item));
        /*for (Item item: this.items) {
            System.out.println(item);
        }*/
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        int counter = items.size();

        // int counter = (int) items.stream().count();

        /*for (Item item: this.items) {
            counter++;
        }*/

        if (counter < 2) {
            return this.itemCounter + " item " + "(" + totalWeight + " kg)";
        }
        return this.itemCounter + " items " + "(" + totalWeight + " kg)";
    }
}
