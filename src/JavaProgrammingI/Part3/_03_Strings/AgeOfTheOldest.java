package JavaProgrammingI.Part3._03_Strings;

import java.util.Scanner;

/*
Write a program that reads names and ages from the user until an empty line is entered.
The name and age are separated by a comma.
 */
public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }

            String[] strings = data.split(",");
            int age = Integer.parseInt(strings[1]);
            if (age > oldest) {
                oldest = age;
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }
}
