package JavaProgrammingII.Part11.ProcessingFiles.saveableDictionary.main;

import JavaProgrammingII.Part11.ProcessingFiles.saveableDictionary.dictioanary.SaveableDictionary;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String file = "C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingII\\Part11\\ProcessingFiles\\saveableDictionary\\files\\dataBase.txt";
        SaveableDictionary dictionary = new SaveableDictionary(file);
        boolean wasSuccessful = dictionary.load();

        dictionary.add("pychak", "knife");
        dictionary.add("soygi", "love");

        //dictionary.delete("knife");

        boolean successfulSave =  dictionary.save();



        /*
        kelle:head
        el:hand
        burn:nose
         */


    }
}
