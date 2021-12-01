package JavaProgrammingI.Part3._01_Lists;

import java.util.ArrayList;

public class IndexOutOfBoundsException {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(i + 1);
        }
        System.out.println(list.get(3));
    }
}
