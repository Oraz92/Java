package JavaProgrammingII.Part12.Randomness;

/*
Write a program that prompts the user for how many random numbers should be generated and then prints the numbers.
The printed numbers should be within the range [0, 10]. Below are some examples.
 */

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many random numbers should be printed?");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.println(random.nextInt(10) + 1);
        }
    }
}
