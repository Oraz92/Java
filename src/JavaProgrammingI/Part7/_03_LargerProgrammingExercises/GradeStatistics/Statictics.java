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

    public int average(ArrayList<Integer> points) {
        int sum = 0;
        for (int point: points) {
            sum += point;
        }
        return sum / points.size();
    }

    public int averageForPassingGrades(ArrayList<Integer> points) {
        int sum = 0;
        for (int point: points) {
            if (isGradePass(point)) {
                sum += point;
            }
        }
        return sum / points.size();
    }

    public boolean isGradePass(int grade) {
        return grade >= 50;
    }

    public int passingPercentage(ArrayList<Integer> points) {
        ArrayList<Integer> passedPoints = new ArrayList<>();
        for (int point: points) {
            if (isGradePass(point)) {
                passedPoints.add(point);
            }
        }
        return (passedPoints.size() / points.size()) * 100;
    }

    public String toString() {
        String result = "";
        for (int value: this.points) {
            result += value + " ";
        }
        return result;
    }
}
