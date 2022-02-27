package JavaProgrammingII.Part10.HandlingCollectionsAsStreams;

/*
In the exercise template, implement the class method public static List<Integer> positive(List<Integer> numbers),
which receives an ArrayList of integers, and returns the positive integers from the list.

Implement the method using stream! For collecting the numbers try the command Collectors.toList() in addition to the
Collectors.toCollection(ArrayList::new) command.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(3);
        numbers.add(-1);
        numbers.add(7);
        System.out.println(positive(numbers));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(value -> value > 0).collect(Collectors.toCollection(ArrayList::new));
    }
}
