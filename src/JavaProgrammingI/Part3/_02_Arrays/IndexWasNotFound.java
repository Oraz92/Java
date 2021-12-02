package JavaProgrammingI.Part3._02_Arrays;

import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
            System.out.print(array[i] + " ");
        }

        System.out.print("\nSearch for? ");
        int number = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println(number + " is at index " + index + ".");
        } else {
            System.out.println(number + " was not found.");
        }
    }
}
