package JavaProgrammingI.Part2._04_MethodsAndDivingIntoSmallParts;

/*
Create a method called average that calculates the average of the numbers passed as parameters.
The previously created method sum must be used inside this method!
 */
public class Averaging {
    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }

    public static double average(int number1, int number2, int number3, int number4) {
        return 1.0 * (number1 + number2 + number3 + number4) / 4;
    }
}
