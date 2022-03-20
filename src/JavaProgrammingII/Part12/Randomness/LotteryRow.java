package JavaProgrammingII.Part12.Randomness;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.numbers = new ArrayList<>();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }

    public void randomizeNumber() {
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(40) + 1;
            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }
    }

    public boolean equals(Object other) {
        return false;
    }

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        row.randomizeNumber();
        ArrayList<Integer> lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (int number: lotteryNumbers) {
            System.out.print(number + " ");
        }
    }
}
