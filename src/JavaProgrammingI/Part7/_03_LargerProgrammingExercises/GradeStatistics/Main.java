package JavaProgrammingI.Part7._03_LargerProgrammingExercises.GradeStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statictics tcs = new Statictics();

        System.out.println("Enter points total, -1 stops:");
        int input;
        while (true) {
            input =  Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            tcs.add(input);
        }
        System.out.print("Point average (all): " + tcs.average() +"\n");
        System.out.print("Point average (passing):" + tcs.averageForPassingGrades() + "\n");
        System.out.print("Pass percentage: " + tcs.passingPercentage() + "\n");
        System.out.println("Grade distribution: ");
        tcs.gradeDistribution();

    }
}
