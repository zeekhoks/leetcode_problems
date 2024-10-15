package data_structures.LeetcodeDaily;

import java.util.*;

public class MaxKScore {
    public static void main(String[] args) {
        
        int[] nums = {1,10,3,3,3};
        int k = 3;
        
        long score = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }

        for(int i=0; i<k; i++){
            long value = maxHeap.poll();
            score = score + value;
            maxHeap.add((int) Math.ceil(value/3.0));
        }
        
        System.out.println("The score is => " + score);
    }
}
