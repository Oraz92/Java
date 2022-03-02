package JavaProgrammingII.Part10.OtherUsefulTechniques.Books;

import JavaProgrammingII.Part9._01_ClassInheritance.CreatingClasses.B;

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
    }
}
