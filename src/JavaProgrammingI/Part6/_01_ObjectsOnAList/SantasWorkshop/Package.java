package JavaProgrammingI.Part6._01_ObjectsOnAList.SantasWorkshop;

import java.util.ArrayList;

public class Package {
    ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int summaryWeight = 0;
        for (Gift item: this.gifts) {
            summaryWeight += item.getWeight();
        }
        return summaryWeight;
    }
}
