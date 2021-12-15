package JavaProgrammingI.Part6._01_ObjectsOnAList.PrintingACollection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;
    private int countOfElements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.countOfElements = 0;
    }

    public void add(String element) {
        this.elements.add(element);
        this.countOfElements++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        String returnString = "";
        System.out.print("The collection alphabet has " + this.countOfElements + " element:");
        for (String element: elements) {
            returnString = returnString + "\n" + element;
        }
        return returnString;
    }


    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alphabet");
        System.out.println(s);

        System.out.println();

        s.add("a");
        System.out.println(s);

        System.out.println();

        s.add("b");
        System.out.println(s);

        System.out.println();

        s.add("c");
        System.out.println(s);
    }

}
