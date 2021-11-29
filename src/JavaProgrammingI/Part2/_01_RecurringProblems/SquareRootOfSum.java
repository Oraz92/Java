package JavaProgrammingI.Part2._01_RecurringProblems;
import java.util.Scanner;
// Write a program that reads two integers from the user and prints the square root of the sum of these integers

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        double squareRoot = Math.sqrt(1.0 * number1 + number2);
        System.out.println(squareRoot);
    }
}
