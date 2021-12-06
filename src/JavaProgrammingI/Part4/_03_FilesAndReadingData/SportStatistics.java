package JavaProgrammingI.Part4._03_FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File: ");
        String fileName = scanner.nextLine();
        int countOfGames = 0;
        try (Scanner reader = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingI\\Part4\\_03_FilesAndReadingData\\Files\\" + fileName))) {
            System.out.print("Team: ");
            String team = scanner.nextLine();
            while (reader.hasNextLine()) {
                String[] strings = reader.nextLine().split(",");
                if (strings[0].equals(team) || strings[1].equals(team)) {
                    countOfGames++;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file '" + fileName + "' failed.");
        }

        System.out.println("Games: " + countOfGames);
    }
}
