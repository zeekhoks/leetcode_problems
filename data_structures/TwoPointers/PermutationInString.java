package data_structures.TwoPointers;

public class PermutationInString {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidblaooo";
        int windowsize = s1.length();
        int[] sourceArray = new int[26];
        int[] targetArray = new int[26];

        int left = 0;
        int right = 0;
        boolean containsPermutation = false;

        for(int i=0; i<s1.length(); i++){
            targetArray[s1.charAt(i)-'a']++;
        }

        while (right < s2.length()) {

            sourceArray[s2.charAt(right) - 'a']++;
            if(sourceArray[s2.charAt(right)-'a'] <= targetArray[s2.charAt(right)-'a']){
                if(right-left+1 == windowsize){
                    containsPermutation = true;
                    break;
                }
            }

            while(sourceArray[s2.charAt(right)-'a'] > targetArray[s2.charAt(right)-'a']){
                sourceArray[s2.charAt(left)-'a']--;
                left++;
            }
            
            right++;
        }

        System.out.println("Can s2 contain a permutation of s1 : " + containsPermutation);

    }

}
