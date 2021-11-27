package JavaProgrammingI.Part1._06_ConditionalStatementsAndOperations;
import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grade = Integer.parseInt(scanner.nextLine());

        if (grade < 0) {
            System.out.println("Impossible!");
        } else {
            if (grade < 50) {
                System.out.println("failed");
            } else if (grade < 60) {
                System.out.println("1");
            } else if (grade < 70) {
                System.out.println("2");
            } else if (grade < 80) {
                System.out.println("3");
            } else if (grade < 90) {
                System.out.println("4");
            } else if (grade < 101) {
                System.out.println("5");
            } else {
                System.out.println("incredable!");
            }
        }

//        if (grade < 0) {
//            System.out.println("Impossible!");
//        } else if (grade < 50) {
//            if (grade > 0) {
//                System.out.println("failed");
//            }
//        } else if (grade < 60) {
//            if (grade > 49) {
//                System.out.println("1");
//            }
//        } else if (grade < 70) {
//            if (grade > 59) {
//                System.out.println("2");
//            }
//        } else if (grade < 80) {
//            if (grade > 69) {
//                System.out.println("3");
//            }
//        } else if (grade < 90) {
//            if (grade > 79) {
//                System.out.println("4");
//            }
//        } else if (grade < 101) {
//            if (grade > 89) {
//                System.out.println("5");
//            }
//        } else if (grade > 100) {
//            System.out.println("incredable!");
//        }
    }

}
