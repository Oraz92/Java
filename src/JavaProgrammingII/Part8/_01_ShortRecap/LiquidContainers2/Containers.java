package JavaProgrammingII.Part8._01_ShortRecap.LiquidContainers2;

import java.util.Scanner;

public class Containers {
    private Container firstContainer;
    private Container secondContainer;
    private Scanner scanner;

    public Containers(Scanner scanner) {
        this.firstContainer = new Container();
        this.secondContainer = new Container();
        this.scanner = scanner;
    }

    public void start() {
        String command;
        int amount;
        menu();
        while (true) {
            printVolume();

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
                            this.firstContainer.setAmount(100);
                        } else if (this.firstContainer.contains() + amount <= 100) {
                            this.firstContainer.add(amount);
                        } else {
                            this.firstContainer.setAmount(100);
                        }
                    }
                }
                case "move" -> {
                    if (isPositive(amount)) {
                        if (amount >= 100) {
                            this.secondContainer.setAmount(100);
                            this.firstContainer.setAmount(0);
                        } else if (secondContainer.contains() + amount <= 100) {
                            this.secondContainer.add(amount);
                            this.firstContainer.remove(amount);
                        } else {
                            this.secondContainer.setAmount(100);
                            this.firstContainer.setAmount(0);
                        }
                    }
                }
                case "remove" -> {
                    if (isPositive(amount)) {
                        if (amount >= 100) {
                            secondContainer.setAmount(0);
                        } else {
                            if (amount > secondContainer.contains()) {
                                secondContainer.setAmount(0);
                            } else {
                                secondContainer.remove(amount);
                            }
                        }
                    }
                }

            }
        }
    }

    public void menu() {
        System.out.println("""
                add - adds liquid to the first container
                move - moves liquid from the first to the second container
                remove - deletes liquid from the second container
                """);
    }

    public void printVolume() {
        System.out.println("First: " + this.firstContainer);
        System.out.println("Second: " + this.secondContainer);
    }

    public boolean isPositive(int amount) {
        return amount > 0;
    }
}
