package JavaProgrammingI.Part3._03_Strings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = {"Guncha", "Amir", "Anastasia", "Oraz" };
        String[] passwords = {"Jabbarova", "Dzhumabayev", "Beresneva", "Jumabayev" };
        int index;
        boolean logged = false;
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter passwor: ");
        String password = scanner.nextLine();


        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username)) {
                if (passwords[i].equals(password)) {
                    logged = true;
                }
                break;
            }
        }

        if (logged) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}

