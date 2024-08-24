package data_structures.BinarySearch;

import java.util.*;

public class SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int left=0, right=nums.length-1;
        List<Integer> check = new ArrayList<>();
        int[] result = new int[nums.length];

        while(left<=right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                check.add(nums[left]*nums[left]);
                left=left+1;
            } else {
                check.add(nums[right]*nums[right]);
                right=right-1;
            }
        }
        for(int i=check.size()-1;i>=0;i--){
            result[i]=check.get(i);
            System.out.println(result[i]);
        }
    }
    
}
