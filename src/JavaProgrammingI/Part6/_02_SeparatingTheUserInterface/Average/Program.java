package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.Average;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        UserInterface2 userInterface = new UserInterface2(register, scanner);
        userInterface.start();
    }
}
