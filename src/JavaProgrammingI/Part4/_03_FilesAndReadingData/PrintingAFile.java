package JavaProgrammingI.Part4._03_FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingI\\Part4\\_03_FilesAndReadingData\\Files\\file.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
