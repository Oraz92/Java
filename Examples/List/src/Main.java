import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int listSize = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listSize; i++) {
            list.add(scanner.nextInt());
        }

        int queryNumber = scanner.nextInt();
        scanner.nextLine();
        for (int j = 0; j < queryNumber; j++) {
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("Insert")) {
                int position = scanner.nextInt();
                int value = scanner.nextInt();
                scanner.nextLine();
                list.add(position, value);
            } else if (command.equalsIgnoreCase("Delete")) {
                int position = Integer.parseInt(scanner.nextLine());
                list.remove(position);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
