package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;
import java.util.Scanner;

/*
Print the last element of the list
 */
public class LastInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            list.add(name);
        }
        System.out.println(list.get(list.size() - 1));
    }
}
