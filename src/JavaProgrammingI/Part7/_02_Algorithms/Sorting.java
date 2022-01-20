package JavaProgrammingI.Part7._02_Algorithms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(array));

        swap(array, 1, 0);
        System.out.println(Arrays.toString(array));

        swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;
        int smallestNumber = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (smallestNumber == array[i]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex + 1];
        int indexOfSmallestAfterStart = startIndex;
        for (int i = startIndex + 2; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallestAfterStart = i;
            }
        }
        return indexOfSmallestAfterStart;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
