package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.Average;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        //register.addGradeBasedOnPoints(88);

        //System.out.println(register.averageOfGrades());
        System.out.println(register.averageOfPoints());
    }
}
