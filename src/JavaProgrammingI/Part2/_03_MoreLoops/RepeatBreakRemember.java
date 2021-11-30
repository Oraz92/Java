package JavaProgrammingI.Part2._03_MoreLoops;

import java.util.Scanner;

public class RepeatBreakRemember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbersCount = 0;
        int evenNumbersCount = 0;
        int oddNumbersCount = 0;
        int sum = 0;
        double average;
        while (true) {
            System.out.println("Give numbers:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numberOfNumbersCount++; // counting all numbers

            if (number % 2 == 0) {
                evenNumbersCount++; // counting even numbers
            } else {
                oddNumbersCount++; // counting odd numbers
            }

            sum += number; // counting sum of all numbers
        }

        average = 1.0 * sum / numberOfNumbersCount; // counting an average

        // Printig resuts
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbersCount);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbersCount);
        System.out.println("Odd: " + oddNumbersCount);
    }
}
