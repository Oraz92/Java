package JavaProgrammingI.Part2._03_MoreLoops;

import java.util.Scanner;

/*
Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
 */
public class SumOfTheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Last number? ");
        int lastNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
