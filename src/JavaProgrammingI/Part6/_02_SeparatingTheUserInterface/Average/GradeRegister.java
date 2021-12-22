package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.Average;

import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public int pointsToGrades(int points) {

        int grade;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }

        int sumOfGrades = 0;
        int countOfGrades = 0;
        for (int grade: this.grades) {
            sumOfGrades += grade;
            countOfGrades++;
        }
        return 1.0 * sumOfGrades / countOfGrades;
    }

    public double averageOfPoints() {
        if (this.points.isEmpty()) {
            return -1;
        }

        int sumOfPoints = 0;
        int countOfPoints = 0;
        for (int point: this.points) {
            sumOfPoints += point;
            countOfPoints++;
        }
        return 1.0 * sumOfPoints / countOfPoints;
    }
}
