package JavaProgrammingI.Part7._01_ProgrammingParadigms.LiquidContainers2;

import java.util.Scanner;

public class Container {
    private int amount;
    private Scanner scanner;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (amount + this.amount <= 100) {
                this.amount += amount;
            } else {
                this.amount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.amount - amount >= 0) {
                this.amount -= amount;
            } else {
                this.amount = 0;
            }
        }
    }

    public String toString() {
        return this.amount + "/100";
    }

    public void start() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add" -> {
                    add(amount);
                }
                case "remove" -> {
                    remove(amount);
                }
            }
        }
    }
}
