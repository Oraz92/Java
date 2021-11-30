package JavaProgrammingI.Part2._03_MoreLoops;

import java.util.Scanner;

/*
Implement a program which calculates the sum of a closed interval, and prints it.
Expect the user to write the smaller number first and then the larger number.
 */
public class SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number?");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = firstNumber; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
