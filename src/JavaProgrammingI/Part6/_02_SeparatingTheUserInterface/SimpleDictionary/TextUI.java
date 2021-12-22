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
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                //SimpleDictionary sd = new SimpleDictionary();
                //sd.add(word, translation);
                this.dictionary.add(word, translation);
                continue;
            }
            System.out.println("Unknown command");
        }
    }
}
