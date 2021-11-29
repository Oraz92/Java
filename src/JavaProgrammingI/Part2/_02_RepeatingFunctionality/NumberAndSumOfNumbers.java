package JavaProgrammingI.Part2._02_RepeatingFunctionality;

import java.util.Scanner;

/*
Write a program that asks the user for input until the user inputs 0. After this the program prints
the amount of numbers inputted and the sum of the numbers
 */
public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                countOfNumbers++;
                sum += number;
            }
        }
        System.out.println("Number of numbers: " + countOfNumbers);
        System.out.println("Sum of the numbers: " + sum);
    }
}
