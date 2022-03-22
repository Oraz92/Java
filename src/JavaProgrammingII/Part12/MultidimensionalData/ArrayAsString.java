package JavaProgrammingII.Part12.MultidimensionalData;

/*
Create in the exercise base a method called public static String arrayAsString(int[][] array). It should create a
string representation of the array it receives as the parameter and return it.
 */

import java.util.Arrays;
import java.util.Random;

public class ArrayAsString {

    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int[][] array = new int[row][column];
        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
        String str = arrayAsString(array);
        System.out.println(str);
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                stringBuilder.append(ints[j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
