package JavaProgrammingI.Part4._01_IntorductionToOOP.Account;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName, int age) {
        this.age = age;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    /*public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }*/


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

    public SimpleDate getBirthday() {
        return this.birthday;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public boolean olderThan(Person compared) {
        return this.birthday.before(compared.birthday);
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    /*public String toString() {
        return this.name + ", age " + this.age + " years";
    }*/

    public String toString() {
        return this.name + ", born on " + this.birthday;
    }

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        if (muhammad.olderThan(pascal)) {  //  same as muhammad.olderThan(pascal)==true
            System.out.println(muhammad.getName() + " is older than " + pascal.getName());
        } else {
            System.out.println(muhammad.getName() + " is not older than " + pascal.getName());
        }
    }
}
