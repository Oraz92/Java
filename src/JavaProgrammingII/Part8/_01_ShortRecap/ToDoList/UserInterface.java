package JavaProgrammingII.Part8._01_ShortRecap.ToDoList;

import java.util.Scanner;

public class UserInterface {
    private ToDoList toDoList;
    private Scanner scanner;

    public UserInterface(ToDoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {
        menu();
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            switch (command) {
                case "add" -> add();
                case "remove" -> remove();
                case "list" -> print();
            }
        }
    }

    public void menu() {
        System.out.println("""
                add - adds task to the list
                remove - removes task from the list
                list - prints all tasks
                stop - quits program
                """);
    }

    public void add() {
        System.out.print("To add: ");
        String task = scanner.nextLine();
        this.toDoList.add(task);
    }

    public void remove() {
        System.out.print("To remove: ");
        int toRemoveTaskNumber = Integer.parseInt(scanner.nextLine());
        this.toDoList.remove(toRemoveTaskNumber);
    }

    public void print() {
        toDoList.print();
    }
}
