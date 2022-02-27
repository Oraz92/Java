package JavaProgrammingII.Part10.HandlingCollectionsAsStreams;

/*
Write a program that reads the user's input as strings. When the user inputs an empty string (only presses enter),
the input reading will be stopped and the program will print all the user inputs.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }

        String oneStringOut = inputs.stream().reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(oneStringOut);
    }

}
