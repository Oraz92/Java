import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        bufferedReader.close();


        ArrayList<Integer> listOfSumsOfHourglasses = new ArrayList<>();
        int depth = (arr.size() - 2) * (arr.size() - 2);

        int loopCounter = 0;
        int column = 0;
        int row = 0;

        while (loopCounter < depth) {
            int[][] tempArray = new int[3][3]; // for calculating sum of each hourglass
            int tempArraySize = tempArray.length;

            int i = 0;
            for (int m = row; m <= row + 2; m++) {
                int j = 0;
                for (int n = column; n <= column + 2; n++) {
                    tempArray[i][j] = arr.get(m).get(n);
                    j++;
                }
                i++;
            }

            // setting two items of an array to get hourglass
            if (tempArray[1][0] != 0) {
                tempArray[1][0] = 0;
            }
            if (tempArray[1][2] != 0) {
                tempArray[1][2] = 0;
            }

            // counting sum all items of a temporary array
            int sumOfTempArrayItems = 0;
            for (int[] ints : tempArray) {
                for (int n = 0; n < tempArraySize; n++) {
                    sumOfTempArrayItems += ints[n];
                }
            }

            // adding sum to list, afterword to find maximum item and the result
            listOfSumsOfHourglasses.add(sumOfTempArrayItems);

            column++;
            if (column == 4) {
                row++;
                column = 0;
            }
            loopCounter++;
        }

        int maxHourglass = Collections.max(listOfSumsOfHourglasses);
        System.out.println(maxHourglass);




        /*
        public static void main(String[] args) throws IOException {
        List<List<Integer>> arr = new ArrayList<>();
        try (var reader = new BufferedReader(
            new InputStreamReader(System.in))) {
            for (int i = 0; i < 6; i++) {
                arr.add(saveInputLineToList(reader));
            }
        }
        System.out.println(maxHourglassSum(arr));
    }

    private static List<Integer> saveInputLineToList(
            BufferedReader reader) throws IOException {
        return Stream.of(
            reader.readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());
    }

    private static int maxHourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 6 - 2; i++) {
            for (int j = 0; j < 6 - 2; j++) {
                int topRowSum =
                    arr.get(i).get(j)
                        + arr.get(i).get(j + 1)
                        + arr.get(i).get(j + 2);
                int middleRowSum =
                    arr.get(i + 1).get(j + 1);
                int bottomRowSum =
                    arr.get(i + 2).get(j)
                        + arr.get(i + 2).get(j + 1)
                        + arr.get(i + 2).get(j + 2);
                maxSum = Math.max(
                    topRowSum + middleRowSum + bottomRowSum, maxSum);
            }
        }
        return maxSum;
    }
         */
    }
}
