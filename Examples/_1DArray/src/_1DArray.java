import java.util.Scanner;

public class _1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 2;
        int[][] myArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                myArray[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
