package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.SimpleDictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.dictionary = simpleDictionary;
    }

    public void start() {
        String word;
        String command;
        while (true) {
            System.out.print("Command: ");
            command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            switch (command) {
                case "add" -> {
                    System.out.print("Word: ");
                    word = scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();
                    this.dictionary.add(word, translation);
                }
                case "search" -> {
                    System.out.print("To be translated: ");
                    word = scanner.nextLine();
                    if (this.dictionary.translate(word) == null) {
                        System.out.println("Word " + word + " was not found");
                    } else {
                        System.out.print("Translation: " + this.dictionary.translate(word) + "\n");
                    }
                }
                default -> System.out.println("Unknown command");
            }
        }
    }
}
