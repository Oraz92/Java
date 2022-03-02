package JavaProgrammingII.Part10.OtherUsefulTechniques.Books;

import JavaProgrammingII.Part9._01_ClassInheritance.CreatingClasses.A;
import JavaProgrammingII.Part9._01_ClassInheritance.CreatingClasses.B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookShelf shelf = new BookShelf();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int bookAgeRecommendation = Integer.parseInt(scanner.nextLine());
            shelf.addBook(new Book(bookName, bookAgeRecommendation));
        }

        System.out.println(shelf);
        // crating book list for sort, at the beginning I didn't understand task correctly
        ArrayList<Book> books = shelf.getBook();

        // Using comparing() and thenComparing() methods to sort list
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);

        books.sort(comparator);
        // commented line below is alternative way command above
        //Collections.sort(books, comparator);

        System.out.println(shelf);


    }
}
