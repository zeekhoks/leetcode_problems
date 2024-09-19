package data_structures.LeetcodeDaily;

import java.util.*;

public class LongestSubstringWithEvenVowels {
    
    public static void main(String[] args) {
        String s = "eleetminicoworoep";
        int mask=0;
        int substringCount = 0;

        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('e',2);
        map.put('i',4);
        map.put('o',8);
        map.put('u',16);

        Map<Integer, Integer> firstOccurence = new HashMap<>();
        firstOccurence.put(0,-1);

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                mask = mask ^ map.get(c);
            }

            if(firstOccurence.containsKey(mask)){
                substringCount = Math.max(substringCount, i-firstOccurence.get(mask));
            } else {
                firstOccurence.put(mask, i);
            }

        }
        
        System.out.println("The longest substring with even vowels => " + substringCount);
    }
}
