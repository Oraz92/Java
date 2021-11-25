package JavaProgrammingI.Part1._04_Variables;
import java.util.Scanner;

public class DifferentTypeOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String text = scanner.nextLine();
        System.out.println("Give an integer:");
        int intNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double doubleNumber = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean statement = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave a string " + text);
        System.out.println("You gave an integer " + intNumber);
        System.out.println("You gave a double " + doubleNumber);
        System.out.println("You gave a boolean " + statement);
    }
}
