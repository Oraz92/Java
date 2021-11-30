package JavaProgrammingI.Part2._03_MoreLoops;

import java.util.Scanner;

/*
Implement a program which calculates the factorial of a number given by the user.

Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n. For example,
the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally, it has been
specified that the factorial of 0 is 1, so 0! = 1.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int result = 1;
        boolean flag = true;
        while (flag) {
            if (number == 0) {
                break;
            } else {
                for (int i = 2; i <= number ; i++) {
                    result *= i;
                }
                flag = false;
            }
        }
        System.out.println("Factorial: " + result);

    }
}
