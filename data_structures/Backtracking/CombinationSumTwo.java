package data_structures.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTwo {

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(candidates);
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        backtrack(candidates, 0, target, new ArrayList<>(), arr);
        for(List<Integer> l : arr){
            System.out.println(l.toString());
        }
    }

    private static void backtrack(int[] candidates, int start, int remain, List<Integer> temp, List<List<Integer>> result){
        if(remain<0) return;
        else if(remain==0) result.add(new ArrayList<>(temp));
        else {
            for(int i=start; i<candidates.length;i++){
                if(i>start&&candidates[i]==candidates[i-1]) continue;
                temp.add(candidates[i]);
                backtrack(candidates, i+1, remain-candidates[i], temp, result);
                temp.remove(temp.size()-1);
            }
        }
        
    }
    
}
