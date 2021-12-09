package JavaProgrammingI.Part4._02_ObjectsInAList.Books;

public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String initialTitle, int initialPages, int publicationYear) {
        this.title = initialTitle;
        this.pages = initialPages;
        this.year = publicationYear;
    }

    public Book(String initialTitle, int year) {
        this.title = initialTitle;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Book, the objects are not equal
        // convert the object to a Book object
        if (!(compared instanceof Book comparedBook)) {
            return false;
        }

        // if the values of the object variables are equal, the objects are, too
        return this.getTitle().equals(comparedBook.getTitle()) &&
                this.getYear() == comparedBook.getYear();
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
