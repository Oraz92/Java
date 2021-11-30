package JavaProgrammingI.Part2._04_MethodsAndDivingIntoSmallParts;

import java.util.Scanner;

/*
Write a program so that the main program asks the user for the number of times the phrase will be printed
 */
public class Reprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfLines; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
