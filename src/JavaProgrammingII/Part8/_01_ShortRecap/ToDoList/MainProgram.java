package JavaProgrammingII.Part8._01_ShortRecap.ToDoList;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        UserInterface userInterface = new UserInterface(list, scanner);
        userInterface.start();
    }
}
