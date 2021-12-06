package JavaProgrammingI.Part4._03_FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the file: ");
        String fileName = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingI\\Part4\\_03_FilesAndReadingData\\Files\\" + fileName))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] strings = row.split(",");
                int age = Integer.parseInt(strings[1]);
                String name = strings[0];
                System.out.println(name + ", age: " + age + " years");
            }
        } catch (Exception e) {
            System.out.println("Reading the file '" + fileName + "' failed.");
        }


    }
}
