package JavaProgrammingI.Part3._03_Strings;

import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains("av")) {
                System.out.println(strings[i]);
            }
        }
    }
}
