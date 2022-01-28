package JavaProgrammingII.Part8._01_ShortRecap.LiquidContainters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        String command;
        int amount;
        menu();
        while (true) {
            printVolume(firstContainer, secondContainer);

            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println();
            String[] parts = input.split(" ");
            command = parts[0];
            amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add" -> {
                    if (isPositive(amount)) {
                        if (amount >= 100) {
                            firstContainer = 100;
                        } else if (firstContainer + amount <= 100) {
                            firstContainer += amount;
                        } else {
                            firstContainer = 100;
                        }
                    }
                }
                case "move" -> {
                    if (isPositive(amount)) {
                        if (amount >= 100) {
                            secondContainer = 100;
                            firstContainer = 0;
                        } else if (secondContainer + amount <= 100) {
                            secondContainer += amount;
                            firstContainer -= amount;
                        } else {
                            secondContainer = 100;
                            firstContainer = 0;
                        }
                    }
                }
                case "remove" -> {
                    if (isPositive(amount)) {
                        if (amount >= 100) {
                            secondContainer = 0;
                        } else {
                            if (amount > secondContainer) {
                                secondContainer = 0;
                            } else {
                                secondContainer -= amount;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void menu() {
        System.out.println("""
                add - adds liquid to the first container
                move - moves liquid from the first to the second container
                remove - deletes liquid from the second container
                """);
    }

    public static void printVolume(int firstContainer, int secondContainer) {
        System.out.println("First: " + firstContainer + "/100");
        System.out.println("Second: " + secondContainer + "/100");
    }

    public static boolean isPositive(int amount) {
        return amount > 0;
    }
}
