package JavaProgrammingI.Part4._03_FilesAndReadingData;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfGuests = new ArrayList<>();
        System.out.print("Name of the file: ");
        String fileName = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\JavaProgrammingI\\Part4\\_03_FilesAndReadingData\\Files\\" + fileName))) {
            while (reader.hasNextLine()) {
                listOfGuests.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Above file 'guestslist.txt' has been read and added to the 'listOfGuests' list.
        // Below program will check if the entered name on the list or not.

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (listOfGuests.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        System.out.println("Thank you!");
    }
}
