package JavaProgrammingI.Part3._03_Strings;

import java.util.Scanner;

/*
Write a program that reads names and ages from the user until an empty line is entered.
The name and age are separated by a comma. Print name of the oldest person
 */
public class NameOfOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameOfTheOldestPerson = "";
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }

            String[] strings = data.split(",");
            int age = Integer.parseInt(strings[1]);
            if (age > oldest) {
                oldest = age;
                nameOfTheOldestPerson = strings[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldestPerson);
    }
}
