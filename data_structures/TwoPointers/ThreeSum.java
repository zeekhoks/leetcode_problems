package data_structures.TwoPointers;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total = nums[i] + nums[j] + nums[k];
                if(total==0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;

                    while (nums[j]==nums[j-1]&&j<k){
                        j++;
                    }
                } else if(total>0){
                    k--;
                } else {
                    j++;
                }

            }
        }

        System.out.println("The triplet combinations are: " + res);
    }
    
}
