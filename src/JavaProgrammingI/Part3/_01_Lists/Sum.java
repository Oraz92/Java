package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sumOfElements = 0;
        for (int element : numbers) {
            sumOfElements += element;
        }
        return sumOfElements;
    }
}
