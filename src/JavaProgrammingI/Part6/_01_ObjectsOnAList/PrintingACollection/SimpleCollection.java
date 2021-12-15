package JavaProgrammingI.Part6._01_ObjectsOnAList.PrintingACollection;

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

    public String name() {
        return this.name;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        String returnStr = this.elements.get(0);
        for (String str: this.elements) {
            if (returnStr.length() < str.length()) {
                returnStr = str;
            }
        }
        /*for (int i = 1; i < this.elements.size(); i++) {
            if (returnStr.length() < this.elements.get(i).length()) {
                returnStr = this.elements.get(i);
            }
        }*/
        return returnStr;
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
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
    }

}
