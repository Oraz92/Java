package JavaProgrammingI.Part5._03_ObjectAndReferences;

import JavaProgrammingI.Part4._01_IntorductionToOOP.Account.Person;
import JavaProgrammingI.Part4._01_IntorductionToOOP.Account.SimpleDate;

public class IdenticalTwins {
    protected Person identical;

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(24, 3, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Leo", date2, 62, 9);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        }
    }
}
