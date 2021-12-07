package JavaProgrammingI.Part5._01_LearningOOP;

public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public String toString() {
        return this.getAuthor() + ", " + this.getName() + ", " + this.getPages() + " pages";
    }

    public static void main(String[] args) {
        Book book = new Book("Oraz", "My son", 100);
        System.out.println(book);
    }
}
