package JavaProgrammingI.Part7._03_LargerProgrammingExercises.GradeStatistics;

import java.util.ArrayList;

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
            if (passingGrade(point)) {
                sum += point;
            }
        }
        return sum / points.size();
    }

    public boolean passingGrade(int grade) {
        return grade >= 50;
    }
}
