package JavaProgrammingI.Part3._02_Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println("\nSum of the elements of an array: " + sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        /*for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }*/
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

}
