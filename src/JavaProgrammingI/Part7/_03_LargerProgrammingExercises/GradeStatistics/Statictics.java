package JavaProgrammingI.Part7._03_LargerProgrammingExercises.GradeStatistics;

import java.util.ArrayList;
import java.util.Arrays;

public class Statictics {
    private ArrayList<Integer> points;

    public Statictics() {
        this.points = new ArrayList<>();
    }

    public void add(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
        }
    }

    public double average() {
        int sum = 0;
        for (int point: points) {
            sum += point;
        }
        return sum * 1.0 / this.points.size();
    }

    public double averageForPassingGrades() {
        int sum = 0;
        int countOfPassedGrades = 0;
        for (int point: this.points) {
            if (isGradePass(point)) {
                countOfPassedGrades++;
                sum += point;
            }
        }
        return sum * 1.0 / countOfPassedGrades;
    }

    public boolean isGradePass(int grade) {
        return grade >= 50;
    }

    public double passingPercentage() {
        ArrayList<Integer> passedPoints = new ArrayList<>();
        for (int point: this.points) {
            if (isGradePass(point)) {
                passedPoints.add(point);
            }
        }
        return (passedPoints.size() * 1.0 / points.size()) * 100;
    }

    public void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < this.points.size(); j++) {
                if (getGrade(this.points.get(j)) == i) {
                    count++;
                }
            }
            System.out.print(i + ": ");
            printStars(count);
            System.out.println();
        }
    }

    public int getGrade(int point) {
        if (point >= 50 && point < 60) {
            return 1;
        } else if (point >= 60 && point < 70) {
            return 2;
        } else if (point >= 70 && point < 80) {
            return 3;
        } else if (point >= 80 && point < 90) {
            return 4;
        } else if (point >= 90) {
            return 5;
        }
        return 0;
    }

    public void printStars(int grade) {
        for (int i = 0; i < grade; i++) {
            System.out.print("*");
        }
    }


    public String toString() {
        String result = "";
        for (int value: this.points) {
            result += value + " ";
        }
        return result;
    }
}
