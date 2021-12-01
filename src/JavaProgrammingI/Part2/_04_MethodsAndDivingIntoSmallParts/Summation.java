package JavaProgrammingI.Part2._04_MethodsAndDivingIntoSmallParts;

/*
Expand the method sum in the exercise template so that it calculates and returns
the sum of the numbers that are given as the parameters.
 */
public class Summation {
    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
}
