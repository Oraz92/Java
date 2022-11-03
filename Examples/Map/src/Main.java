import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap();
        int queryNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < queryNumber; i++) {
            String name = scanner.nextLine();
            String number = scanner.nextLine();
            if (number.length() == 8 && !name.isEmpty()) {
                map.put(number, name);
            }
        }

        List<String> names = new ArrayList<>();
        for (int i = 0; i < queryNumber; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        for (String searchingName : names) {
            boolean notFound = true;
            for (String key : map.keySet()) {
                String name = map.get(key);
                if (name.equals(searchingName)) {
                    System.out.println(name + "=" + key);
                    notFound = false;
                    break;
                }
            }
            if (notFound) {
                System.out.println("Not found");
            }
        }
    }
}
