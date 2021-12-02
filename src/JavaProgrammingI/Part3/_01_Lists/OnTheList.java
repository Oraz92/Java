package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfNames = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }

            listOfNames.add(name);
        }
        System.out.print("Search for? ");
        String name = scanner.nextLine();
        if (listOfNames.contains(name)) {
            System.out.println(name + " was found!");
        } else {
            System.out.println(name + " was not found!");
        }
    }
}
