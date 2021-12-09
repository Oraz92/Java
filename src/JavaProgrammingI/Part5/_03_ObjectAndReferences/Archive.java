package JavaProgrammingI.Part5._03_ObjectAndReferences;

import java.util.ArrayList;
import java.util.Scanner;

public class Archive {
    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not type of Archive, the objects are not equal
        // convert the object to Archive object
        if (!(compared instanceof Archive compareConverted)) {
            return false;
        }

        // if the values are equal, the objects are too
        return this.getIdentifier().equals(compareConverted.getIdentifier());
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive data = new Archive(identifier, name);
            if (!archives.contains(data)) {
                archives.add(data);
            } 
        }

        System.out.println("==Items==");
        for (Archive item : archives) {
            System.out.println(item);
        }

    }
}
