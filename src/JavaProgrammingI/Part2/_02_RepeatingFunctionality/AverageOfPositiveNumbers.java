package JavaProgrammingI.Part2._02_RepeatingFunctionality;

import java.util.Scanner;

/*
Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the positive numbers
 */
public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPositiveNumbers = 0;
        int sum = 0;
        double average;
        while (true) {
            System.out.println("Give a nubmer:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                countOfPositiveNumbers++;
                sum += number;
            }
        }
        average = 1.0 * sum / countOfPositiveNumbers;
        System.out.println("Average of positive numbers: " + average);
    }
}
