package JavaProgrammingI.Part2._03_MoreLoops;

import java.util.Scanner;

/*
Write a program, which reads an integer from the user. Then the program prints numbers from that number to 100
 */
public class CountignToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit = 100;
        System.out.print("Give a number: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        for (int i = inputNumber; i <= upperLimit; i++) {
            System.out.println(i);
        }
    }
}
