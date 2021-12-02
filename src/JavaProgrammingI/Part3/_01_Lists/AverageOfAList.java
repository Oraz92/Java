package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int countOfElements = 0;
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }

        for (int element : list) {
            sum += element;
        }
        double average = 1.0 * sum / list.size();
        System.out.println("Average: " + average);
    }
}
