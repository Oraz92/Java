package JavaProgrammingI.Part2._02_RepeatingFunctionality;

import java.util.Scanner;

/*
Write a program that reads values from the user until they input a 0. After this, the program prints
 the total number of inputted values that are negative. The zero that's used to exit the loop should not be
 included in the total number count.
 */
public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeNumbersCount = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number > 0) {
                continue;
            } else {
                negativeNumbersCount++;
            }
        }
        System.out.println("Number of negative numbers: " + negativeNumbersCount);
    }
}
