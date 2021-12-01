package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int countOfNames = 0;
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }

            list.add(name);
            countOfNames++;
        }
        System.out.println("In total: " + list.size());
    }
}
