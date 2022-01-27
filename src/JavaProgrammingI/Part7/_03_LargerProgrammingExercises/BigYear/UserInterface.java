package JavaProgrammingI.Part7._03_LargerProgrammingExercises.BigYear;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Birds birds;

    public UserInterface(Scanner scanner, Birds birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {
        printMenu();
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            switch (command) {
                case "Add" -> addToBirdsList();
                case "Observation" -> observation();
                case "All" -> printAll();
                case "One" -> printOne();
            }
        }

    }

    public void addToBirdsList() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String nameInLatin = scanner.nextLine();
        this.birds.add(name, nameInLatin);
    }

    public void observation() {
        System.out.print("Bird: ");
        String birdName = scanner.nextLine();
        this.birds.observation(birdName);
    }

    public void printOne() {
        System.out.print("Bird: ");
        String birdName = scanner.nextLine();
        this.birds.printOne(birdName);
    }

    public void printAll() {
        this.birds.printAll();
    }

    public void printMenu() {
        System.out.println("""
                Add - adds a bird
                Observation - adds an observation
                All - prints all birds
                One - prints one bird
                Quit - ends the program
                """);
    }

}
