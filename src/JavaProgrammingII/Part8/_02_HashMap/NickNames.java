package JavaProgrammingII.Part8._02_HashMap;

import java.util.HashMap;

public class NickNames {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("oraz", "orazik");
        nicknames.put("amir", "amirchik");
        nicknames.put("guncha", "bubulyok");

        for (String key: nicknames.keySet()) {
            System.out.println(key + "'s nickname is " + nicknames.get(key));
        }
    }
}
