package JavaProgrammingII.Part9._02_Interfaces;

import java.util.HashSet;
import java.util.Set;

public class SetAsMethodParameter {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
        for (String name: names) {
            System.out.println(name);
        }
    }

    public static int returnSize(Set<String> names) {
        return names.size();
    }
}
