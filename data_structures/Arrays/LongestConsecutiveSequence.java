package data_structures.Arrays;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        
        int[] nums = {100,4,200,1,3,2};
        Set<Integer> set = new HashSet<>();
        int longest = 1;

        if(nums.length==0) longest = 0;

        for(int num: nums){
            set.add(num);
        }

        for(int num: nums ){
            //check if the num is the start of a sequence by checking if left exists
            if(!set.contains(num-1)){ // start of a sequence
                 int count =1;
                 while(set.contains(num + 1)){ // check if set contains next number
                     num++;
                     count++;
                 }
                 longest = Math.max(longest, count);
                 
            }
            // if(longest > nums.length/2) break;
 
        }

        System.out.println("The length of the longest sequence is: " + longest);


    }
    
}
