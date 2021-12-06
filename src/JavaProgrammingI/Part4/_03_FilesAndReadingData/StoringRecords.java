package JavaProgrammingI.Part4._03_FilesAndReadingData;

import JavaProgrammingI.Part4._01_IntorductionToOOP.Account.Person;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the file: ");
        String fileName = scanner.nextLine();
        ArrayList<Person> people = readRecordsFromFile(fileName);
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingI\\Part4\\_03_FilesAndReadingData\\Files\\" + file))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] strings = row.split(",");
                int age = Integer.parseInt(strings[1]);
                String name = strings[0];
                personArrayList.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Reading the file '" + file + "' failed.");
        }
        return personArrayList;
    }
}


