package JavaProgrammingI.Part4._01_IntorductionToOOP.Account;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName, int age) {
        this.age = age;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 30);
        Person antti = new Person("Antti", 20);

        int i = 0;
        while (i < 30) {
            pekka.growOlder();
            i = i + 1;
        }

        antti.growOlder();

        System.out.println(antti); // same as System.out.println(antti.toString());
        System.out.println(pekka); // same as System.out.println(pekka.toString());
    }
}
