package data_structures.TwoPointers;

// Go to this solution for a detailed variable sliding window explanation  - : https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/2133524/java-c-a-reall-detailed-explanation/

import java.util.*;

public class LongestSubstringWithoutRepeats {

    public static void main(String[] args) {
        String str = "abcabcbb";

        HashSet<Character> set = new HashSet<>();
        int p1 = 0;
        int p2 = 0;
        int maxLength = 0;

        while(p2<str.length()){
            if(!set.contains(str.charAt(p2))){
                set.add(str.charAt(p2));
                p2+=1;
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(str.charAt(p1));
                p1++;
            }
        }

        
        System.out.println("The longest substring length : " + maxLength);

    }

}
