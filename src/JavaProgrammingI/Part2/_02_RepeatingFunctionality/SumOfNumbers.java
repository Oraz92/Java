package JavaProgrammingI.Part2._02_RepeatingFunctionality;

import java.util.Scanner;

/*
Write a program that reads numbers from the user until the user inputs a number 0. After this the program outputs
the sum of the numbers. The number zero does not need to be added to the sum, even if it does not change the results.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                sum += number;
            }
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
