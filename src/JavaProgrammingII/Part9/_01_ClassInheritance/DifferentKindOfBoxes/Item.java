package JavaProgrammingII.Part9._01_ClassInheritance.DifferentKindOfBoxes;

public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.weight;
        return result;
    }

    @Override
    public boolean equals(Object comparedObject) {
        // Checking if object point to the address
        if (this == comparedObject) {
            return true;
        }

        // Checking is comparedObject instanceof Item and cast it
        if (!(comparedObject instanceof Item comparedItem)) {
            return false;
        }

        // If instances of objects are equal, then objects equal too
        return this.name.equals(comparedItem.name);
    }
}
