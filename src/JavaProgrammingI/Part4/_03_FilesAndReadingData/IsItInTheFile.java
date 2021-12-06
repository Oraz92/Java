package JavaProgrammingI.Part4._03_FilesAndReadingData;

import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingI\\Part4\\_03_FilesAndReadingData\\Files\\" + fileName))) {
            boolean found = false;
            System.out.print("Search for: ");
            String input = scanner.nextLine();
            while (reader.hasNextLine()) {
                if (reader.nextLine().equals(input)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found!");
            }
        } catch (Exception e) {
            System.out.println("Reading the file '" + fileName + "' failed.");
        }
    }
}
