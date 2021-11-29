package JavaProgrammingI.Part2._03_MoreLoops;

import java.util.Scanner;

/*
Write a program that reads an integer from the user. Next, the program prints numbers from 0
to the number given by the user
 */
public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
