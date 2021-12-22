package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.JokeManager;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager manager;

    public UserInterface(Scanner scanner, JokeManager manager) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        String joke;
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            System.out.print("\nCommmand: ");
            String command = scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            switch (command) {
                case "1" -> {
                    System.out.print("Write the joke to be added: ");
                    joke = scanner.nextLine();
                    this.manager.addJoke(joke);
                }
                case "2" -> System.out.println(this.manager.drawJoke());
                case "3" -> this.manager.printJokes();
            }
        }
    }
}
