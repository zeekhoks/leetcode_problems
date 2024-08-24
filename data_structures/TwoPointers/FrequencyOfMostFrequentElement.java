package data_structures.TwoPointers;

// Important problem

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {
    public static void main(String[] args) {
        int[] nums = { 1,4,8,13 };
        Arrays.sort(nums);
        int k = 5;
        int i=0;
        int j = 0;
        int total = 0;
        int count = 0;

        while(j<nums.length){
            total += nums[j];

            while(nums[j]*(j-i+1) > total + k){
                total-=nums[i];
                i++;
            }   
            count = Math.max(count, j-i+1);
            j++;
        }

        System.out.println("The frequency of the most frequent element is : " + count);

    }
}
