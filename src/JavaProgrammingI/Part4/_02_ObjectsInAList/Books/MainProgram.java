package JavaProgrammingI.Part4._02_ObjectsInAList.Books;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, publicationYear);
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);
                counter++;
            }
        }

        System.out.println("Thank you! Books added:" + counter);









        /*Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, pages, publicationYear);
            books.add(book);
        }

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        if (input.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (input.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }*/
    }
}
