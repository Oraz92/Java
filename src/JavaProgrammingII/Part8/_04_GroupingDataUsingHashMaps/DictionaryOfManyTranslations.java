package JavaProgrammingII.Part8._04_GroupingDataUsingHashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        //ArrayList<String> translations = this.dictionary.get(word);
        //translations.add(translation);
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.dictionary.getOrDefault(word, emptyList);
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }

}
