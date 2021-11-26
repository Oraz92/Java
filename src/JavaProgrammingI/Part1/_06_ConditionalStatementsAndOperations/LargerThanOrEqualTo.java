package JavaProgrammingI.Part1._06_ConditionalStatementsAndOperations;
import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        if (firstNumber > secondNumber) {
            System.out.println("Greater number is " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Greater nuber is " + secondNumber);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
