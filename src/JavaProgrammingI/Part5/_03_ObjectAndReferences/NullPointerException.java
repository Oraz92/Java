package JavaProgrammingI.Part5._03_ObjectAndReferences;

import JavaProgrammingI.Part4._01_IntorductionToOOP.Account.Person;

public class NullPointerException {
    public static void main(String[] args) {
        Person oraz = new Person("Oraz", 29);
        System.out.println(oraz);

        Person amir = oraz;
        System.out.println(amir);
        amir.growOlder();
        amir.growOlder();

        oraz = null;
        oraz.growOlder();
        System.out.println(oraz);

    }
}
