package JavaProgrammingII.Part10.HandlingCollectionsAsStreams;

/*
Implement a program, which reads user input. If the user input is "end", the program stops reading input. The rest
of the input is numbers. When the user input is "end", the program prints the average of all of the numbers.

Implement calculating the average using a stream!
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        double average = inputs.stream().mapToInt(s -> Integer.parseInt(s)).average().getAsDouble();
        System.out.println(average);


    }
}
