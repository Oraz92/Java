package JavaProgrammingI.Part2._02_RepeatingFunctionality;

import java.util.Scanner;

/*
Write a program that asks the user for input until the user inputs 0. After this, the program
prints the average of the numbers.
 */
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average;
        int countOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else {
                countOfNumbers++;
                sumOfNumbers += number;
            }
        }
        average = 1.0 * sumOfNumbers / countOfNumbers;
        System.out.println("Average of numbers: " + average);
    }
}
