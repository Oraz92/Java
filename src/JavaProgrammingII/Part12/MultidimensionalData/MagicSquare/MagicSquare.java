package JavaProgrammingII.Part12.MultidimensionalData.MagicSquare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MagicSquare {
    private int[][] numbers;

    public MagicSquare(int size) {
        this.numbers = new int[size][size];
    }

    public MagicSquare() {
    }

    public void creteAnArray(int size) {
        numbers = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                numbers[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public ArrayList<Integer> sumOfRows() {
        ArrayList<Integer> sumOfRows = new ArrayList<>();
        for (int[] number : numbers) {
            int sum = 0;
            for (int n = 0; n < numbers.length; n++) {
                sum += number[n];
            }
            sumOfRows.add(sum);
        }
        System.out.println("Sum of rows: "  + sumOfRows);
        return sumOfRows;
    }

    public ArrayList<Integer> sumOfColumns() {
        ArrayList<Integer> sumOfColumns = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            int j = 0;
            int sum = 0;
            while (j < numbers.length) {
                sum += numbers[j][i];
                j++;
            }
            sumOfColumns.add(sum);
        }
        System.out.println("Sum of columns: "  + sumOfColumns);
        return sumOfColumns;
    }

    public ArrayList<Integer> sumOfDiagonals() {
        ArrayList<Integer> sumOfDiagonals = new ArrayList<>();

        // counting forward diagonal
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i < numbers.length) {
            sum += numbers[i][j];
            i++;
            j++;
        }
        sumOfDiagonals.add(sum);

        // counting backward diagonal
        sum = 0;
        i = 0;
        j = numbers.length - 1;
        while (i < numbers.length) {
            sum += numbers[i][j];
            i++;
            j--;
        }
        sumOfDiagonals.add(sum);

        System.out.println("Sum of diagonals: "  + sumOfDiagonals);
        return sumOfDiagonals;
    }

    public ArrayList<Integer> siamese() {
        ArrayList<Integer> magicSquare = new ArrayList<>();

        // Initializing all cells of square with 0 to check is cell is empty or not
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = 0;
            }
        }

        int row = 0;
        int column = 0;

        // finding the centr
        int center = numbers.length / 2;
        int counter = 1;

        // Initializing the center of first row of square
        numbers[row][center] = counter;


        return magicSquare;
    }

    public boolean isEmpty(int cell) {
        return cell == 0;
    }

    public static void main(String[] args) {
        /*MagicSquare magicSquare = new MagicSquare();
        magicSquare.creteAnArray(3);
        magicSquare.sumOfRows();
        magicSquare.sumOfColumns();
        magicSquare.sumOfDiagonals();*/

        MagicSquare magicSquare = new MagicSquare(3);
        magicSquare.siamese();

    }


}
