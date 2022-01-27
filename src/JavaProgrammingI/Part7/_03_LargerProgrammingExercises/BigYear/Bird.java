package JavaProgrammingI.Part7._03_LargerProgrammingExercises.BigYear;

public class Bird {
    private String name;
    private String nameInLatin;
    private int observations;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observations = 0;
    }

    public void increaseObservation() {
        this.observations++;
    }

    public int getObservations() {
        return this.observations;
    }

    public String getName() {
        return this.name;
    }

    public String getNameInLatin() {
        return this.nameInLatin;
    }

    public String toString() {
        return this.getName() + " (" + this.getNameInLatin() + "): " + this.getObservations() + " observations";
    }
}
