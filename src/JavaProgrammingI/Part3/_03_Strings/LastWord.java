package JavaProgrammingI.Part3._03_Strings;

import java.util.Scanner;

/*
Write a program that reads user input until an empty line is entered. For each non-empty line
the program splits the string by spaces and prints the last part of the string.
 */
public class LastWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            String[] strings = str.split(" ");
            System.out.println(strings[strings.length - 1]);
        }
    }
}
