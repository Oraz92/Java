package JavaProgrammingI.Part2._04_MethodsAndDivingIntoSmallParts;

public class AdvancedAstrology {
    public static void main(String[] args) {
        //printTriangle(4);
        printChristmasTree(15);
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            for (int j = 0; j < i; j++) {
                printStars(1);
            }
            System.out.println();
        }
    }

    public static void printChristmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            for (int j = 0; j < i; j++) {
                printStars(1);
            }
            printStars(i - 1);
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            for (int j = 0; j < 3; j++) {
                printStars(1);
            }
            System.out.println();
        }
    }
}
