package JavaProgrammingI.Part7._03_LargerProgrammingExercises.RecipeSearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = consoleScanner.nextLine();

        printMenu();

        ArrayList<String> recipes = readFromFile(fileName);
        recipes.add(0, ""); // it gets easier further calculations

        while (true) {
            System.out.print("\nEnter command: ");
            String command = consoleScanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            switch (command) {
                case "list" -> printList(recipes);
                case "find name" -> findName(recipes);
                case "find cooking time" -> findCookingTime(recipes);
                case "find ingredient" -> findIngredient(recipes);
            }
        }
    }

    public static ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> readRecipes = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get("C:\\Users\\oraz_\\IdeaProjects\\Java\\src\\" +
                "JavaProgrammingI\\Part7\\_03_LargerProgrammingExercises\\RecipeSearch\\" + fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                readRecipes.add(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return readRecipes;
    }

    public static void printList(ArrayList<String> recipes) {
        System.out.println("\nRecipes: ");
        int i = 0;
        while (i < recipes.size()) {
            if (recipes.get(i).isEmpty()) {
                System.out.println(recipes.get(i + 1) + ", cooking time: " + recipes.get(i + 2));
                i += 2;
                continue;
            }
            i++;
        }
    }

    public static void findName(ArrayList<String> recipes) {
        System.out.print("Searched word: ");
        Scanner scanner = new Scanner(System.in);
        String foodName = scanner.nextLine();
        System.out.println("\nRecipes: ");
        int i = 0;
        while (i < recipes.size()) {
            if (recipes.get(i).isEmpty()) {
                if (recipes.get(i + 1).contains(foodName)) {
                    System.out.println(recipes.get(i + 1) + ", cooking time: " + recipes.get(i + 2));
                    i += 2;
                    continue;
                }
            }
            i++;
        }
    }

    public static void findCookingTime(ArrayList<String> recipes) {
        System.out.print("Max cooking time: ");
        Scanner scanner = new Scanner(System.in);
        int maxCookingTime = Integer.parseInt(scanner.nextLine());
        System.out.println("\nRecipes: ");
        int i = 0;
        while (i < recipes.size()) {
            if (recipes.get(i).isEmpty()) {
                if (Integer.parseInt(recipes.get(i + 2)) <= (maxCookingTime)) {
                    System.out.println(recipes.get(i + 1) + ", cooking time: " + recipes.get(i + 2));
                    i += 2;
                    continue;
                }
            }
            i++;
        }
    }

    public static void findIngredient(ArrayList<String> recipes) {
        System.out.print("Ingredient: ");
        Scanner scanner = new Scanner(System.in);
        String ingredient = scanner.nextLine();
        System.out.println("\nRecipes: ");
        int i = 0;
        while (i < recipes.size()) {
            if (recipes.get(i).isEmpty()) {
                String recipe = recipes.get(i + 1) + ", cooking time: " + recipes.get(i + 2);
                i += 2;
                int j = i;
                while (!recipes.get(j).isEmpty()) {
                    if (recipes.get(j).equals(ingredient)) {
                        System.out.println(recipe);
                    }
                    j++;
                }
                i += (j - 2);
                continue;
            }
            i++;
        }
    }

    public static void printMenu() {
        System.out.println("""
                Commands:
                list - lists the recipes
                stop - stops the program
                find name - searches recipes by cooking time
                find cooking time - searches recipes by cooking time
                find ingredient - searches recipes by ingredient""");
    }

}
