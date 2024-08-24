package data_structures.TwoPointers;

import java.util.*;

// You are given an array of integers nums and an integer target.

// Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 10^9 + 7.

public class NumberOfSubsequencesSum {

    public static void main(String[] args) {
        
        int[] nums = {3,5,6,7};
        Arrays.sort(nums);
        int n = nums.length-1;
        int target = 9; 
        int left = 0;
        int right =   n-1;
        double result = 0;
        double mod = 100000007;
        
        for(int i=0; i<n; i++){
            while(nums[left]+nums[right] > target && i<=right){
                right-=1;
            }
            if(i<=right){
                result = result + Math.pow(2,(right-i));
                result %= mod;
            }
        }
        System.out.println("Result is : " + result);

    }
}
