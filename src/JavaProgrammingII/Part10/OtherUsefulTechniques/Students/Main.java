package JavaProgrammingII.Part10.OtherUsefulTechniques.Students;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student guncha = new Student("Guncha");
        Student oraz = new Student("Oraz");
        Student amir = new Student("Amir");
        Student nastya = new Student("Nasyta");
        Student berdi = new Student("Berdi");
        Student masha = new Student("Masha");

        students.add(guncha);
        students.add(oraz);
        students.add(amir);
        students.add(nastya);
        students.add(berdi);
        students.add(masha);

        students.forEach(System.out::println);
        System.out.println();
        students.stream().sorted().forEach(System.out::println);
    }
}
