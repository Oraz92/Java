package JavaProgrammingI.Part4._01_IntorductionToOOP;

public class Agent {
    private String firstName;
    private String lastName;

    public Agent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "My name is " + lastName + ", " + firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        System.out.println(bond);
    }
}
