package JavaProgrammingII.Part9._01_ClassInheritance.PersonAndSubclasses;

public class Student extends Person {

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int credits() {
        return this.credits;
    }

    public void study() {
        this.credits++;
    }
}