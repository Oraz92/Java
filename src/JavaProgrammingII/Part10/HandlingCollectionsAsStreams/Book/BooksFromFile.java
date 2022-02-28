package JavaProgrammingII.Part10.HandlingCollectionsAsStreams.Book;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.cert.Extension;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        try {
            // reading the "authors.txt" file line by line
            Files.lines(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingII\\Part10\\HandlingCollectionsAsStreams\\Book\\" + file))
                    // splitting the row into parts on the "," character
                    .map(row -> row.split(","))
                    // creating books from the parts
                    .map(parts -> new Book(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    // and finally add the books to the list
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }

}
