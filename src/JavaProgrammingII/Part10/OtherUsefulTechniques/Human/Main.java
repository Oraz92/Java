package JavaProgrammingII.Part10.OtherUsefulTechniques.Human;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        Human guncha = new Human("Guncha", 100);
        Human oraz = new Human("Oraz", 200);
        Human nastya = new Human("Nastya", 50);

        humans.add(guncha);
        humans.add(oraz);
        humans.add(nastya);

        humans.forEach(System.out::println); // humans.stream().forEach(human -> System.out.println(human));
        System.out.println();
        humans.stream().sorted().forEach(System.out::println); // humans.stream().sorted().forEach(human -> System.out.println(human));



    }
}
