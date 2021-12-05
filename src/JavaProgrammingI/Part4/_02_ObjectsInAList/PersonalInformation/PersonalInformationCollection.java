package JavaProgrammingI.Part4._02_ObjectsInAList.PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> personalInformations = new ArrayList<>();
        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            PersonalInformation personalInformation = new PersonalInformation(firstName, lastName, identificationNumber);
            personalInformations.add(personalInformation);
        }

        for (PersonalInformation information : personalInformations) {
            System.out.println(information.getFirstName() + " " + information.getLastName());
        }
    }
}
