package JavaProgrammingI.Part2._01_RecurringProblems;

import java.util.Scanner;

/*
Write a program that reads two integers from the user. If the first number is greater than the second,
the program prints "(first) is greater than (second)." If the first number is less than the second,
the program prints "(first) is smaller than (second)." Otherwise, the program prints "(first)
is equal to (second)." The (first) and (second) should always be replaced with the actual numbers
that were provided by the user.
 */
public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        if (number1 > number2) {
            System.out.println(number1 + " is greater than " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " is smaller than " + number2);
        } else {
            System.out.println(number1 + " is equal to " + number2);
        }
    }
}
