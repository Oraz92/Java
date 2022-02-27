package JavaProgrammingII.Part10.HandlingCollectionsAsStreams.UniqueLastNames;

/*
The exercise template contains a sketch of a program that reads user-provided information about people. Expand the
program so that it will print all the unique last names of the user-provided people in alphabetical order.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends, space to continue:");
            System.out.println("Continue personal information input? \"quit\" ends, space to continue:");
            String command = scanner.nextLine();
            if (command.equals("quit")) {
                break;
            }
            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Input last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Input  the year of birth: ");
            int yearOfBirth = Integer.parseInt(scanner.nextLine());
            people.add(new Person(firstName, lastName, yearOfBirth));
            System.out.println();
        }

        people.stream().map(person -> person.getLastName()).distinct().sorted()
                .forEach(lastName -> System.out.println(lastName));
    }
}
