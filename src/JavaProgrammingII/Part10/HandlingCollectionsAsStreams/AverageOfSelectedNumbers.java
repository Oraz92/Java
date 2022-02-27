package JavaProgrammingII.Part10.HandlingCollectionsAsStreams;

/*
Implement a program, which reads user input. If the user input is "end", program stops reading input. The rest
of the input is numbers.

Then user is asked if the program should print the average of all the positive numbers, or the average of
all the negative numbers (n or p). If the user selects "n", the average of all the negative numbers is printed.
Otherwise the average of all the positive numbers is printed.

Use streams to calculate the average and filter the numbers!
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        double average = 0;
        if (command.equals("p")) {
            average = inputs.stream().mapToInt(s -> Integer.parseInt(s)).filter(number -> number > 0).average().getAsDouble();
        } else if (command.equals("n")) {
            average = inputs.stream().mapToInt(s -> Integer.parseInt(s)).filter(number -> number < 0).average().getAsDouble();
        }

        System.out.println("Average of the negative numbers: " + average);
    }

}
