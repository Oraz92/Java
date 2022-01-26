package JavaProgrammingI.Part7._02_Algorithms.Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            String name = i + "Yes";
            books.add(new Book(i, name));
        }
        String name = binarySearch(books, 2);
        System.out.println(name);
    }

    public static String linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return books.get(i).getName();
            }
        }
        return "not found";
    }

    public static String binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        int middle;
        while (!(begin > end)) {
            middle = (begin + end) / 2;
            if (middle == searchedId) {
                return books.get(middle).getName();
            }

            if (middle > searchedId) {
                end = end - middle;
            }

            if (middle < searchedId) {
                begin = begin + middle;
            }
        }

        return "not found";
    }
}
