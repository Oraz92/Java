package JavaProgrammingII.Part9._02_Interfaces.InterfaceInABox;

public class CD implements Packable {

    private String artist;
    private String CDName;
    private int publicationYear;
    private double weight;

    public CD(String artist, String CDName, int publicationYear) {
        this.artist = artist;
        this.CDName = CDName;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.CDName + " (" + this.publicationYear + ")";
    }
}
