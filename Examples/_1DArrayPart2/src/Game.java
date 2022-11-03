import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int querySize = scanner.nextInt();
        for (int i = 0; i < querySize; i++) {
            canWin(scanner);
        }
    }

    public static void canWin(Scanner scanner) {
        int arraySize = scanner.nextInt();
        int leap = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        LinkedList<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.push(array[0]);

        while (queue.size() > 0) {
            int i = queue.pop();
            visited.add(i);

            int backward = i - 1;
            int forward = i + 1;
            int jump = i + leap;

            if (jump >= arraySize || forward >= arraySize) {
                System.out.println("YES");
                return;
            }

            if (!visited.contains(backward) && backward > 0 && array[backward] == 0) {
                visited.add(backward);
                queue.push(backward);
            }

            if (!visited.contains(forward) && forward > 0 && array[forward] == 0) {
                visited.add(forward);
                queue.push(forward);
            }

            if (!visited.contains(jump) && jump > 0 && array[jump] == 0) {
                visited.add(jump);
                queue.push(jump);
            }
        }
        System.out.println("NO");
    }
}
