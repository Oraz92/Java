package JavaProgrammingI.Part4._02_ObjectsInAList.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item item = new Item(name);
            items.add(item);
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
