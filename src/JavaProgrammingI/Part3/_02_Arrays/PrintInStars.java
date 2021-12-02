package JavaProgrammingI.Part3._02_Arrays;

import java.util.Scanner;

public class PrintInStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
            System.out.print(array[i] + " ");
        }
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        System.out.println();
        /*for (int i = 0; i < array.length; i++) {
            printStars(array[i]);
        }*/
        for (int i : array) {
            printStars(i);
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
