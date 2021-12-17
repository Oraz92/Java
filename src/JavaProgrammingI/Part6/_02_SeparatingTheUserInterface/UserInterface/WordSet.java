package JavaProgrammingI.Part6._02_SeparatingTheUserInterface.UserInterface;

import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        this.words.add(word);
    }

    public boolean alreadyEntered(String word) {
        return this.words.contains(word);
    }

    public int palindromes() {
        int counter = 0;
        for (String word: this.words) {
            if (isPalendrome(word)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isPalendrome(String word) {
        String backWord = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            backWord += word.charAt(i);
        }
        return word.equals(backWord);
    }
}
