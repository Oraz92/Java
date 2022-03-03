package JavaProgrammingII.Part10.TheComparableInterface.RegularExpressions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String pattern = scanner.nextLine();

        Checker checker = new Checker();
        if (checker.isDayOfWeek(pattern)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
