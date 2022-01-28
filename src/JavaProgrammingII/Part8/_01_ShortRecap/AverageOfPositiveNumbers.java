package JavaProgrammingII.Part8._01_ShortRecap;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int sum = 0;
        int countOfPositiveNumbers = 0;
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number > 0) {
                sum += number;
                countOfPositiveNumbers++;
            }
        }
        double average = 1.0 * sum / countOfPositiveNumbers;
        System.out.println(average);
    }
}
