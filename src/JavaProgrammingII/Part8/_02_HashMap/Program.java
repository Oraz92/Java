package JavaProgrammingII.Part8._02_HashMap;

import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
        // Test your program here!

    }

    public static void printKeys(HashMap<String, String> abbreviations) {
        for (String key: abbreviations.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> abbreviations, String part) {
        for (String key: abbreviations.keySet()) {
            if (abbreviations.get(key).contains(part)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> abbreviations, String part) {
        for (String key: abbreviations.keySet()) {
            if (key.contains(part)) {
                System.out.println(abbreviations.get(key));
            }
        }
    }
}
