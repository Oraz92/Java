package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.Average;

import java.util.Scanner;

public class UserInterface2 {
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface2(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        printGradeDistribution();
        System.out.println("The average of points: " + this.register.averageOfPoints());
        System.out.println("The average of grades: " + this.register.averageOfGrades());
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.parseInt(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println();

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
