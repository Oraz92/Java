/*
You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to
 tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that
 line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries.
 Each query will consist of two integers  and .

Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> listOfInputs = new ArrayList<>();
        int numberOfInputs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfInputs; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            ArrayList<Integer> integers = new ArrayList<>();
            if (Integer.parseInt(parts[0]) == 0) {
                listOfInputs.add(integers);
                continue;
            } else {
                for (int j = 1; j < parts.length; j++) {
                    int integer = Integer.parseInt(parts[j]);
                    integers.add(integer);
                }
            }
            listOfInputs.add(integers);
        }

        ArrayList<ArrayList<Integer>> listOfQueries = new ArrayList<>();
        int numberOfQueries = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfQueries; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            ArrayList<Integer> queries = new ArrayList<>();
            queries.add(Integer.parseInt(parts[0]));
            queries.add(Integer.parseInt(parts[1]));
            listOfQueries.add(queries);
        }

        for (int i = 0; i < numberOfQueries; i++) {
            int lineNumber = listOfQueries.get(i).get(0) - 1;
            if (listOfInputs.get(lineNumber).size() > 0) {
                int index = listOfQueries.get(i).get(1) - 1;
                if (index < listOfInputs.get(lineNumber).size()) {
                    System.out.println(listOfInputs.get(lineNumber).get(index));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
