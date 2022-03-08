package JavaProgrammingII.Part11.ProcessingFiles.saveableDictionary.main;

import JavaProgrammingII.Part11.ProcessingFiles.saveableDictionary.dictioanary.SaveableDictionary;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SaveableDictionary dictionary = new SaveableDictionary("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingII\\Part11\\ProcessingFiles\\saveableDictionary\\files\\dataBase.txt");
        boolean wasSuccessful = dictionary.load();

        if (wasSuccessful) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
    }
}
