package JavaProgrammingI.Part5._02_RemovingRepetetiveCode;

public class Productt {
    private String name;
    private String location;
    private int weight;

    public Productt(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Productt(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Productt(String name, int weight) {
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }

    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }

    public static void main(String[] args) {
        Productt tapeMeasure = new Productt("Tape measure");
        Productt plaster = new Productt("Plaster", "home improvement section");
        Productt tyre = new Productt("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);

    }


}
