package data_structures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        if (s.length() != t.length())
            return false;

        for (char ch : t.toCharArray()) {
            count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (map.containsKey(currentChar) ) {
                int currentCount = map.get(currentChar);
                if(currentCount>0){
                    map.put(currentChar, currentCount - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        String s = "aacc";
        String t = "ccac";
        boolean result = solution.isAnagram(s, t);
        System.out.println("Answer : " + result);

    }

}
