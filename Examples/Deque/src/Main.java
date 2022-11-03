import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i <5; i++) {
            Thread.sleep(60);
        }

        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }

        System.out.println(max);
        /*Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = deque.size(); i > 0; i--) {
            numbers.add(deque.removeFirst());
        }

        int subArraySize = m;

        Deque<Integer> subArray = new ArrayDeque<>();
        ArrayList<Integer> setOfUniqueNumberArrays = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int uniqueNumberCounter = 0;
            if (i == 0) {
                for (int j = 0; j < subArraySize; j++) {
                    if (j == 0) {
                        uniqueNumberCounter++;
                        subArray.add(numbers.get(j));
                    } else {
                        if (!subArray.contains(numbers.get(j))) {
                            uniqueNumberCounter++;
                        }
                        subArray.add(numbers.get(j));
                    }
                }
                i += subArraySize - 1;
            } else {
                subArray.removeFirst();
                subArray.addLast(numbers.get(i));
                ArrayList<Integer> subArraylist = new ArrayList<>();

                for (int j = subArray.size(); j > 0; j--) {
                    subArraylist.add(subArray.removeFirst());
                }

                uniqueNumberCounter = howManyUniqueNumbers(subArraylist);

                for (int j = 0; j < subArraySize; j++) {
                    subArray.addLast(subArraylist.get(j));
                }

            }
            setOfUniqueNumberArrays.add(uniqueNumberCounter);
        }
        try {
            System.out.println(Collections.max(setOfUniqueNumberArrays));
        } catch (ClassCastException | NoSuchElementException e) {
            System.out.println("Exception caught: " + e);
        }*/

        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F; System.out.println(sec + " seconds");
    }

    public static int howManyUniqueNumbers(ArrayList<Integer> numbers) {
        int uniqueNumbersCount = 1;
        for (int i = 0; i < numbers.size(); i++) {
            int uniqueNumber = numbers.get(i);
            for (int j = 0; j < numbers.size(); j++) {
                if (i != j) {
                    if (uniqueNumber == numbers.get(j)) {
                        break;
                    } else if (j == numbers.size() - 1) {
                        uniqueNumbersCount++;
                    }
                }
            }
            if (uniqueNumbersCount == numbers.size()) {
                break;
            }
        }
        return uniqueNumbersCount;
    }

}
