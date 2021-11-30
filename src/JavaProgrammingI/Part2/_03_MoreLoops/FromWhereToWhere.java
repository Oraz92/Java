package JavaProgrammingI.Part2._03_MoreLoops;

import java.util.Scanner;

/*
Write a program which prints the integers from 1 to a number given by the user.
Ask the user for the starting point as well
 */
public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int uppurLimit = Integer.parseInt(scanner.nextLine());
        System.out.println("Wrere from?");
        int bottomLimit = Integer.parseInt(scanner.nextLine());
        for (int i = bottomLimit; i <= uppurLimit ; i++) {
            System.out.println(i);
        }
    }
}
