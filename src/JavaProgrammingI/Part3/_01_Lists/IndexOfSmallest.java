package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
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
        System.out.println("The smallest number: " + smallest(list));
        System.out.println("Found at index: " + indexOfSmallestElement(list, smallest(list)));
    }

    public static int smallest(ArrayList<Integer> list) {
        int smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }
        return smallest;
    }

    public static int indexOfSmallestElement(ArrayList<Integer> list, int smallest) {
        int indexOfSmallest = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
}
