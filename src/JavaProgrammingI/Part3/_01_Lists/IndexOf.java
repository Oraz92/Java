package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            list.add(number);
        }
        System.out.print("Search for? ");
        int elementOfList = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == elementOfList) {
                System.out.println(elementOfList + " is at index " + i);
            }
        }
    }
}
