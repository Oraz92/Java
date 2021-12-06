package JavaProgrammingI.Part4._03_FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File: ");
        String fileName = scanner.nextLine();
        int countOfGames = 0;
        int countOfWins = 0;
        int countOfLosses = 0;
        try (Scanner reader = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingI\\Part4\\_03_FilesAndReadingData\\Files\\" + fileName))) {
            System.out.print("Team: ");
            String team = scanner.nextLine();
            while (reader.hasNextLine()) {
                String[] strings = reader.nextLine().split(",");
                if (strings[0].equals(team) || strings[1].equals(team)) {
                    countOfGames++;
                    if (strings[0].equals(team) && Integer.parseInt(strings[2]) > Integer.parseInt(strings[3])) {
                        countOfWins++;
                    } else if (strings[0].equals(team) && Integer.parseInt(strings[2]) < Integer.parseInt(strings[3])) {
                        countOfLosses++;
                    } else if (strings[1].equals(team) && Integer.parseInt(strings[2]) < Integer.parseInt(strings[3])) {
                        countOfWins++;
                    } else {
                        countOfLosses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file '" + fileName + "' failed.");
        }

        System.out.println("Games: " + countOfGames);
        System.out.println("Wins: " + countOfWins);
        System.out.println("Loses: " + countOfLosses);
    }
}
