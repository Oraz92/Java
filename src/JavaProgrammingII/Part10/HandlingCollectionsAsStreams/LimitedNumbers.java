package JavaProgrammingII.Part10.HandlingCollectionsAsStreams;

/*
Write a program that reads user input. When the user gives a negative number as an input, the input reading will be
stopped. After this, print all the numbers the user has given as input that are between 1 and 5.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 0) {
                break;
            }

            numbers.add(input);
        }

        numbers.stream().filter(number -> number > 0 && number < 6).forEach(number -> System.out.println(number));
    }
}
