package JavaProgrammingI.Part7._02_Algorithms;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {8, 3, 7, 14, 9, 1, 2, 4, 22, 0, 11};

        System.out.println(Arrays.toString(array));
        System.out.println();
        sort(array);
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
        int indexOfSmallestAfterStart = startIndex + 1;
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

    public static void sort(int[] array) {
        int mainIteration = 0;
        while (mainIteration < array.length - 2) {
            int firstIndexAtEachMainIteration = mainIteration + 1;
            if (mainIteration == 0) {
                int firstSmallElement = indexOfSmallest(array);
                swap(array, mainIteration, firstSmallElement);
                //System.out.println(Arrays.toString(array));
            }
            int smallestIndexFrom = indexOfSmallestFrom(array,mainIteration);
            swap(array, firstIndexAtEachMainIteration, smallestIndexFrom);
            //System.out.println(Arrays.toString(array));
            mainIteration++;
        }
    }
}
