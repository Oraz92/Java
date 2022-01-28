package JavaProgrammingII.Part8._01_ShortRecap;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int number = Integer.parseInt(input);
            System.out.println(cube(number));
        }
    }

    public static int cube(int number) {
        return number * number * number;
    }

    public static void menu() {
        System.out.println("End - will quit program");
        System.out.println("Enter number: ");
    }
}
