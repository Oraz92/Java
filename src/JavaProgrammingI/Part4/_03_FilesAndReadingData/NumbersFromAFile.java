package JavaProgrammingI.Part4._03_FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File? ");
        String fileName = scanner.nextLine();

        int count = 0;
        try (Scanner reader = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingI\\Part4\\_03_FilesAndReadingData\\Files\\" + fileName))) {
            System.out.print("Lower bound? ");
            int lowerBound = Integer.parseInt(scanner.nextLine());
            System.out.print("Upper bound? ");
            int upperBound = Integer.parseInt(scanner.nextLine());

            while (reader.hasNextLine()) {
                int number = Integer.parseInt(reader.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file '" + fileName + "' failed.");
        }

        if (count > 0) {
            System.out.println("Numbers: " + count);
        }

    }
}
