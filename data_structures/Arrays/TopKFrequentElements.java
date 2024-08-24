package data_structures.Arrays;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = { 4,1,-1,2,-1,2,3 };
        int count = Integer.MIN_VALUE;
        int k=2;
        int[] result = new int [k];
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        for(int i=0; i<nums.length;i++){
                count = sortedMap.getOrDefault(nums[i], 0);
                sortedMap.put(nums[i], count+1);
        }
        
        Iterator<Integer> iterator = sortedMap.keySet().iterator();
        for(int i=0; i<k && iterator.hasNext(); i++){
            result[i] = iterator.next();
            System.out.println(result[i]);
        }
        
    }
    
}
