package JavaProgrammingII.Part10.HandlingCollectionsAsStreams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        read("presidents.txt");
    }

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingII\\Part10\\HandlingCollectionsAsStreams\\" + file))
                    .forEach(rows::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return rows;
    }
}
