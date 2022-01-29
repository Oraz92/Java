package JavaProgrammingII.Part8._02_HashMap.PrintMeAnotherHashMap;

import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> books) {
        for (Book book: books.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> books, String text) {
        for (Book book: books.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
