package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.JokeManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();
        /*jokeManager.addJoke("Oraz");
        jokeManager.addJoke("Roza");
        jokeManager.addJoke("Amir");
        jokeManager.addJoke("Guncha");*/
        UserInterface userInterface = new UserInterface(scanner, jokeManager);
        userInterface.start();

    }
}
