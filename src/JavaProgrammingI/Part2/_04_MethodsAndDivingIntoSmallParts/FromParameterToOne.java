package JavaProgrammingI.Part2._04_MethodsAndDivingIntoSmallParts;

/*
Create the following method in the exercise template: public static void printFromNumberToOne(int number).
It should print the numbers from the number passed as a parameter down to one
 */
public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
