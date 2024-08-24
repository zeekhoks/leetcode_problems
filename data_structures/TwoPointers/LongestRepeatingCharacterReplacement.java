package data_structures.TwoPointers;

import java.util.*;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "AABABBA";
        int[] arr = new int[26];
        int k = 1;
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int result = 0;

        while (right < s.length()) {
            arr[s.charAt(right) - 'A']++;

            maxLength = Math.max(maxLength, arr[s.charAt(right) - 'A']);

            if (right - left + 1 - maxLength > k) {

                arr[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
            right++;
        }

        System.out.println("Maximum length of repeating characters string : " + result);
    }

}
