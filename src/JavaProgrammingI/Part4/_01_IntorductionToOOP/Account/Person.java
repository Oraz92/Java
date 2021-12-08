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

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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


    public void growOlder() {
        this.age = this.age + 1;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
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
