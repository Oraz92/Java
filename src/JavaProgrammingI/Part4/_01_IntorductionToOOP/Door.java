package JavaProgrammingI.Part4._01_IntorductionToOOP;

public class Door {
    public void knock() {
        System.out.println("Who's there?");
    }

    public static void main(String[] args) {
        Door amir = new Door();
        amir.knock();
    }
}
