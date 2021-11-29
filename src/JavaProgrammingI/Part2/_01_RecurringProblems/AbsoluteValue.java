package JavaProgrammingI.Part2._01_RecurringProblems;
import java.util.Scanner;

/* Write a program that reads an integer from the user. If the number is less than 0, the program prints the given
 integer multiplied by -1. In all other cases, the program prints the number itself
 */

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.abs(integer));
    }
}
