/*
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .
 */


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        /*int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.nextInt();
        }*/

        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = getRandomNumberInRange(-10000, 10000);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int countOfSubArrays = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            sum += array[i];
            if (sum < 0) {
                countOfSubArrays++;
            }
            if (i == array.length - 1) {
                break;
            }
            for (int j = i + 1; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    countOfSubArrays++;
                }
            }
        }

        System.out.println(countOfSubArrays);
    }

    public static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
