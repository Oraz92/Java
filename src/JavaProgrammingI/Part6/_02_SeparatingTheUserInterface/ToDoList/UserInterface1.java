package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.ToDoList;

import JavaProgrammingI.Part6._02_SeparatingTheUserInterface.UserInterface.UserInterface;

import java.util.Scanner;

public class UserInterface1 {
    private Scanner scanner;
    private ToDoList list;

    public UserInterface1(ToDoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.list.add(toAdd);
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int index = Integer.parseInt(scanner.nextLine());
                this.list.remove(index);
            }
        }
    }

}
