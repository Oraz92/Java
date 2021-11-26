package JavaProgrammingI.Part1._05_CalculatingWithNumbers;
import java.util.Scanner;

public class SumOfTheTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int nubmer2 = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers " + (number1 + nubmer2));
    }
}
