package JavaProgrammingI.Part3._02_Arrays;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println("\nGive two indices to swap:");
        int firstIndex = Integer.parseInt(scanner.nextLine());
        int secondIndex = Integer.parseInt(scanner.nextLine());

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        System.out.println();
        /*for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/

        for (int item : array) {
            System.out.print(item + " ");
        }

    }
}
