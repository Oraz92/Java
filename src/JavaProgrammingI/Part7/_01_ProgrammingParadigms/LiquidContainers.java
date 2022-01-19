package JavaProgrammingI.Part7._01_ProgrammingParadigms;

import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add" -> {
                    if (amount > 100) {
                        firstContainer = 100;
                        continue;
                    } else if (amount <= 0) {
                        firstContainer = 0;
                        continue;
                    }
                    firstContainer += amount;
                }
                case "move" -> {
                    if (amount < firstContainer) {
                        secondContainer = amount;
                        firstContainer -= amount;
                    } else if (amount >= 100) {
                        secondContainer = 100;
                        firstContainer = 0;
                    }
                }
                case "remove" -> {
                    if (amount >= secondContainer) {
                        secondContainer = 0;
                    } else {
                        secondContainer -= amount;
                    }
                }
            }



            /*
            // Adding liquid to the first container
            if (command.equals("add")) {
                if (amount > 100) {
                    firstContainer = 100;
                    continue;
                } else if (amount < 0) {
                    continue;
                }
                firstContainer += amount;
            }

            // Moving liquid from the first to the second container
            if (command.equals("move")) {
                if (amount < firstContainer) {
                    secondContainer = amount;
                    firstContainer -= amount;
                    continue;
                } else if (amount >= 100) {
                    secondContainer = 100;
                    firstContainer = 0;
                    continue;
                }
            }

            // Removing liquid from the second container
            if (command.equals("remove")) {
                if (amount >= secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer -= amount;
                }
            }*/

        }
    }
}
