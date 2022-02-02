package JavaProgrammingII.Part9._02_Interfaces.InterfaceInABox;

import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> packables;
    private int capacity;

    public Box(int capacity) {
        this.packables = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable pack) {
        if (weight() + pack.weight() <= capacity) {
            this.packables.add(pack);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable pack: this.packables) {
            weight += pack.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.packables.size() + " items,"
                + " total weight " + weight();
    }
}
