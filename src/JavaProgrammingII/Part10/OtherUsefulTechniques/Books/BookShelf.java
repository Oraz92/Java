package JavaProgrammingII.Part10.OtherUsefulTechniques.Books;

import java.util.ArrayList;

public class BookShelf {

    private ArrayList<Book> books;
    private int booksCount;

    public BookShelf() {
        this.books = new ArrayList<>();
        this.booksCount = 0;
    }

    public void addBook(Book book) {
        this.books.add(book);
        this.booksCount++;
    }

    @Override
    public String toString() {
        StringBuilder tempBooks = new StringBuilder();
        for (Book book: this.books) {
            tempBooks.append(book).append("\n");
        }
        return this.booksCount + " in total.\n\nBooks:\n" + tempBooks;
    }
}
