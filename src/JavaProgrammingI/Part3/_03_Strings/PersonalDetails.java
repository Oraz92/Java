package JavaProgrammingI.Part3._03_Strings;

import java.util.Scanner;

/*
Write a program that reads names and birth years from the user until an empty line is entered.
The name and birth year are separated by a comma.
After that the program prints the longest name and the average of the birth years.
If multiple names are equally longest, you can print any of them.
You can assume that the user enters at least one person.
 */
public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int countYearsNumber = 0;
        int sumOfYears = 0;
        while (true) {
            String data = scanner.nextLine();
            if (data.equals("")) {
                break;
            }
            // Splitting entered string by comma
            String[] strings = data.split(",");
            // Comparing length of name
            if (strings[0].length() > longestName.length()) {
                longestName = strings[0];
            }
            // Converting year from string to integer
            int year = Integer.parseInt(strings[1]);
            sumOfYears += year;
            countYearsNumber++;
        }

        System.out.println("Longest name: " + longestName);
        double average = 1.0 * sumOfYears / countYearsNumber;
        System.out.println("Average of the birth years: " + average);
    }
}
