package JavaProgrammingI.Part2._04_MethodsAndDivingIntoSmallParts;


/*
Define a method called greatest that takes three numbers and returns the greatest of them.
If there are multiple greatest values, returning one of them is enough
 */
public class Greatest {
    public static void main(String[] args) {
        int answer = greatest(4, 1, 7);
        System.out.println("Greatest: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
