package JavaProgrammingI.Part4._01_IntorductionToOOP.Statistics;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        /*Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());*/
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            statistics.addNumber(number);
        }
        System.out.println("Sum: " + statistics.sum());
    }
}
