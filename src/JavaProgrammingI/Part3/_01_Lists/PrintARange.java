package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;

public class PrintARange {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        //printNumbersInRange(numbers, 0 , 5);
        printNumbersInRange(numbers, 2, 5);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        /*for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit) {
                System.out.println(numbers.get(i));
            }
        }*/
        for (int element : numbers) {
            if (element >= lowerLimit && element <= upperLimit) {
                System.out.println(element);
            }
        }
    }
}
