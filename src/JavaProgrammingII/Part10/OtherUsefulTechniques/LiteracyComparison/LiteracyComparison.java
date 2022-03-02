package JavaProgrammingII.Part10.OtherUsefulTechniques.LiteracyComparison;

/*
Create a program that first reads the file literacy.csv and then prints the contents from the lowest to the highest
ranked on the literacy rate. The output must be exactly as in the following example. The example shows the
first five of the expected rows.

Sample output
Niger (2015), female, 11.01572
Mali (2015), female, 22.19578
Guinea (2015), female, 22.87104
Afghanistan (2015), female, 23.87385
Central African Republic (2015), female, 24.35549
 */


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class LiteracyComparison {

    public static void main(String[] args) {

        // Creating list of string list
        List<List<String>> literacyReport = new ArrayList<>();
        // putting file paths to variable fileRepo to readability of code
        String fileRepo = "C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingII\\Part10\\OtherUsefulTechniques\\LiteracyComparison\\" + "literacy.csv";


        try (Scanner reader = new Scanner(Paths.get(fileRepo))) {
            while (reader.hasNextLine()) {
                // reading file line by line
                String readLineFromFile = reader.nextLine();
                // splitting read string into an array of strings separating by comma
                String[] parts = readLineFromFile.split(",");
                for (int i = 0; i < parts.length; i++) {
                    // removing whitespaces
                    parts[i] = parts[i].trim();
                    if (i == 2) {
                        // removing (%) part from gender
                        String[] subParts = parts[i].split(" ");
                        parts[i] = subParts[0];
                    }
                }
                List<String> strings = new ArrayList<>();
                strings.add(parts[3] + " (" + parts[4] + ")");
                strings.add(parts[2]);
                strings.add(parts[5]);
                // adding ready for work list of string to main the list
                literacyReport.add(strings);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // sorting list using stream methods from the lowest rank to the highest
        literacyReport.stream().sorted(Comparator.comparingDouble(rank -> Double.parseDouble(rank.get(2))))
                .forEach(System.out::println);

        System.out.println();

        // // sorting list using stream methods in alphabetical order by countries name
        literacyReport.stream().sorted((country1, country2) -> country1.get(0).compareToIgnoreCase(country2.get(0)))
                .forEach(System.out::println);
    }

}
