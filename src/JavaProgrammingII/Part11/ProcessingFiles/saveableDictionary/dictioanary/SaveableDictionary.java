package JavaProgrammingII.Part11.ProcessingFiles.saveableDictionary.dictioanary;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SaveableDictionary {

    private Map<String, String> translations;

    public SaveableDictionary() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.translations.put(word, translation);
        }
    }

    public String translate(String word) {
        for (Map.Entry<String, String> entry : this.translations.entrySet()) {
            if (entry.getKey().equals(word)) {
                return entry.getValue();
            } else if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }
        /*if (this.translations.containsKey(word)) {
            Optional<String> translation =  this.translations
                    .entrySet()
                    .stream()
                    .filter(key -> key.equals(word))
                    .map(Map.Entry::getValue)
                    .findFirst();
            if (translation.isPresent()) {
                return translation.get();
            }
        } else if (this.translations.containsValue(word)) {
            Optional<String> translation = this.translations
                    .entrySet()
                    .stream()
                    .filter(value -> value.equals(word))
                    .map(Map.Entry::getKey)
                    .findFirst();
            return translation.orElseGet(translation::get);
        }*/
        return null;
    }

    public void delete(String word) {
        if (this.translations.containsKey(word)) {
            this.translations.entrySet().removeIf(entry -> entry.getKey().equals(word));
        } else if (this.translations.containsValue(word)) {
            this.translations.entrySet().removeIf(entry -> entry.getValue().equals(word));
        }
    }


}
