package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("")) {
                break;
            }
            list.add(str);
        }
        System.out.println(list.get(0));
    }
}
