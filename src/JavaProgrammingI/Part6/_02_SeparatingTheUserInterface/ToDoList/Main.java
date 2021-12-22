package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        UserInterface1 userInterface = new UserInterface1(list, scanner);

        userInterface.start();

    }
}
