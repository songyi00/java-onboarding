package onboarding;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {
        Map<Character, Character> map = new HashMap<>();
        int interval = 0;

        for (int i = 65; i <= 90; i++) {
            map.put((char) i, (char) (90 - interval));
            interval += 1;
        }

        return "";
    }


}
