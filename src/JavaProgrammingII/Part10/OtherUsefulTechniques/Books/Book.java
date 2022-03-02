package JavaProgrammingII.Part10.OtherUsefulTechniques.Books;

public class Book {

    private String name;
    private int ageRecommendation;
    private int numberOfBooks;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
        this.numberOfBooks++;
    }

    public String getName() {
        return this.name;
    }

    public int getAgeRecommendation() {
        return this.ageRecommendation;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.getAgeRecommendation() + " year-olds or older)";
    }
}
