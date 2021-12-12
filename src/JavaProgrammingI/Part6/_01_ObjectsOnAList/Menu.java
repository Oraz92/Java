package JavaProgrammingI.Part6._01_ObjectsOnAList;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void clearMenu() {
        int size = this.meals.size();
        for (int i = 0; i < size ; i++) {
            this.meals.remove(this.meals.size() - 1);
        }
    }

    public void printMeals() {
        for (String meal: meals) {
            System.out.println(meal);
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
