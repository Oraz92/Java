import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        while (testCases > 0) {
            String[] parts = new String[3];
            String input = scanner.nextLine();
            parts = input.split(" ");
            students.add(new Student(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2])));
            testCases--;
        }

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
