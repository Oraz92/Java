package JavaProgrammingI.Part4._01_IntorductionToOOP;

public class Song {
    private String author;
    private String name;
    private int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public Song(String author, String name, int length) {
        this(name, length);
        this.author = author;
    }

    public String author() {
        return this.author;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Person, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Person object
        Song comparedSong = (Song) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.author().equals(comparedSong.author()) &&
                this.name().equals(comparedSong.name()) &&
                this.length() == comparedSong.length()) {
            return true;
        }
        return false;
    }


    public String toString() {
        return this.author + "'s song '" + this.name() +"' has the length of " + this.length() + " seconds.";
    }

    public static void main(String[] args) {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        System.out.println(jackSparrow.equals(anotherSparrow));
    }

}
