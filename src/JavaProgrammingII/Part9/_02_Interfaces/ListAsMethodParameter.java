package JavaProgrammingII.Part9._02_Interfaces;

// List as methods parameter
import java.util.ArrayList;
import java.util.List;

public class ListAsMethodParameter {

    public static int returnSize(List<String> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        System.out.println(returnSize(names));
    }
}
