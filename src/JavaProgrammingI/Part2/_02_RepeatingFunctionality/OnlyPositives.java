package JavaProgrammingI.Part2._02_RepeatingFunctionality;

import java.util.Scanner;

/*
Write a program that asks the user for numbers. If the number is negative (smaller than zero),
the program prints for user "Unsuitable number" and asks the user for a new number. If the number is zero,
the program exits the loop. If the number is positive, the program prints the number to the power of two.
 */
public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("Unsuitable number");
                //continue;
            } else if (number == 0) {
                break;
            }
        }
    }
}
