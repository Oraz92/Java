package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.UserInterface;

import java.util.Scanner;

public class UserInterface {
    private WordSet wordSet;
    private Scanner scanner;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }

    public void start() {
        while (true) {
            System.out.print("Entere a word: ");
            String word = scanner.nextLine();

            if (this.wordSet.alreadyEntered(word)) {
                break;
            }
            this.wordSet.add(word);
        }
        System.out.println("You gave the same word twice!");
        System.out.println(this.wordSet.palindromes() + " of the words were palindromes.");
    }
}
