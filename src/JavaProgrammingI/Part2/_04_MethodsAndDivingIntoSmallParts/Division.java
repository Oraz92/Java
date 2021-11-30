package JavaProgrammingI.Part2._04_MethodsAndDivingIntoSmallParts;


/*
Write a method public static void division(int numerator, int denominator) that prints
the result of the division of the numerator by the denominator
 */
public class Division {
    public static void main(String[] args) {
        division(5, 2);
    }

    public static void division(int numerator, int denominator) {
        System.out.println(1.0 * numerator / denominator);
    }
}
