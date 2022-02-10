package JavaProgrammingII.Part9._03_ObjecPolymorphism.Herds;

import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
    }

    @Override
    public String toString() {
        String output = "";
        for (Movable movable: this.herd) {
            output += movable + "\n";
        }
        return output;
    }
}
