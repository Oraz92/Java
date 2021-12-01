package JavaProgrammingI.Part2._04_MethodsAndDivingIntoSmallParts;

import java.util.Scanner;

/*
Write a method public static String word(). The method must return a string of your choice.
 */
public class Word {
    public static void main(String[] args) {
        System.out.println(word());
    }

    public static String word() {
        System.out.println("Which one will You choose?\n1. Samsung \n2. iPhone");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            return "Samsung";
        } else if (choice == 2) {
            return "iPhone";
        } else {
            return "Another option...";
        }
    }
}
