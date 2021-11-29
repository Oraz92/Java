package JavaProgrammingI.Part2._02_RepeatingFunctionality;

import java.util.Scanner;

/*
Write a program, according to the preceding example, that asks the user to input values until they input the value 4.
 */
public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 4) {
                break;
            }
        }
    }
}
