package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        System.out.print("From where? ");
        int bottomLine = Integer.parseInt(scanner.nextLine());
        System.out.print("To where? ");
        int upperLine = Integer.parseInt(scanner.nextLine());

        for (int i = bottomLine; i <= upperLine; i++) {
            System.out.println(list.get(i));
        }

    }
}
