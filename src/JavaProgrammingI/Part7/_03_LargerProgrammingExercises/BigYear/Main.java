package JavaProgrammingI.Part7._03_LargerProgrammingExercises.BigYear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Birds birds = new Birds();

        UserInterface userInterface = new UserInterface(scanner, birds);
        userInterface.start();
    }
}
