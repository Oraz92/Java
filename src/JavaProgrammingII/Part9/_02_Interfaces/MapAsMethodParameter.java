package JavaProgrammingII.Part9._02_Interfaces;

import java.util.HashMap;
import java.util.Map;

public class MapAsMethodParameter {

    public static int returnSize(Map<String, String> map) {
      return map.size();
    }

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));
    }
}
