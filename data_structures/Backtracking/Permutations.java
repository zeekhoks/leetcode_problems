package data_structures.Backtracking;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        backtrack(arr, new ArrayList<>(), nums);
        for(List<Integer> l : arr){
            System.out.println(l.toString());
        }
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
        }
        for(int i=0; i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(list, temp, nums);
            temp.remove(temp.size()-1);
        }
    }
    
}
