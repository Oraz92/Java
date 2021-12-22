package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.JokeManager;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        return this.jokes.get(random());
    }

    public int random() {
        Random random = new Random();
        return random.nextInt(this.jokes.size() - 1);
    }

    public void printJokes() {
        for (String joke: this.jokes) {
            System.out.println(joke);
        }
    }
}
