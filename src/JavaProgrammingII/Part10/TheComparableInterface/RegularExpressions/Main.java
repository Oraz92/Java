package JavaProgrammingII.Part10.TheComparableInterface.RegularExpressions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String pattern = scanner.nextLine();

        /*Checker dayOfWeek = new Checker();
        if (dayOfWeek.isDayOfWeek(pattern)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }*/


       /* Checker vowels = new Checker();
        if (vowels.allVowels(pattern)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }*/

        Checker time = new Checker();
        if (time.timeOFDay(pattern)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }


    }
}
