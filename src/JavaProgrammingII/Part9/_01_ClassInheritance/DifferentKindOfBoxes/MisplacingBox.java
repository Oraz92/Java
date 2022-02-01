package JavaProgrammingII.Part9._01_ClassInheritance.DifferentKindOfBoxes;

import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> missedItems;

    public MisplacingBox() {
        this.missedItems = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.missedItems.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
