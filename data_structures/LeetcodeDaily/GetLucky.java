package data_structures.LeetcodeDaily;

import java.util.*;

public class GetLucky {
    
    public static void main(String[] args) {
        String s="leetcode";
        // String main = "abcdefghijklmnopqrstuvwxyz";
        String helper = "";
        int k=2;

        // Map<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i<main.length(); i++){
        //     map.put(main.charAt(i), main.charAt(i)-'a'+1);
        // }

        for(int j=0; j<s.length(); j++){
            int calc =  s.charAt(j)-'a'+1;
            helper = helper + calc;
        }

        int b = sumOfDigits(helper);

        // System.out.println(helper);

        for(int m=0; m<k; m++){
            b = sumOfDigits(Integer.toString(b));            
        }

        System.out.println("The sum is - " + b);


    }

    private static int sumOfDigits (String str){
        int sum= 0;
        for(char c: str.toCharArray()){
            sum = sum + c-'0';
        }

        return sum;
    }
}
