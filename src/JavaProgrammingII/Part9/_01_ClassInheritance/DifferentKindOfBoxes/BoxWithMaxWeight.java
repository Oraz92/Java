package JavaProgrammingII.Part9._01_ClassInheritance.DifferentKindOfBoxes;

import java.util.ArrayList;
import java.util.Collections;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for (Item iterate: this.items) {
            totalWeight += iterate.getWeight();
        }
        if (totalWeight + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
