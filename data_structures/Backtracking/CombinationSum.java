package data_structures.Backtracking;

import java.util.*;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        backtrack(candidates, 0, 0, target, new ArrayList<>(), arr);
        for(List<Integer> l : arr){
            System.out.println(l.toString());
        }
    }

    public static void backtrack(int[] candidates, int i, int sum, int target, List<Integer> temp, List<List<Integer>> arr ){
        
        if(sum==target){
            arr.add(new ArrayList<>(temp));
            return;
        }

        if(i==candidates.length || sum>target){
            return;
        }
        temp.add(candidates[i]);
        backtrack(candidates, i, sum+candidates[i], target, temp, arr);
        temp.remove(temp.size()-1);
        backtrack(candidates, i+1, sum, target, temp, arr);
    }
    
}
