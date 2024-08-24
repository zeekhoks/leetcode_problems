package data_structures.Backtracking;

import java.util.*;

public class GenerateSubsets {

    public static void main(String[] args) {
        int[] n = {1,2,3};
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        backtrack(n, 0, arr, new ArrayList<>());
        for(List<Integer> l : arr){
            System.out.println(l.toString());
        }
    }

    public static void backtrack(int[] n, int start, List<List<Integer>> arr, List<Integer> temp ){
        arr.add(new ArrayList<>(temp));

        if(start>n.length){
            return;
        }

        for(int i = start; i<n.length; i++ ){
            temp.add(n[i]);
            backtrack(n, i+1, arr, temp);
            temp.remove(temp.size()-1);
        }
        
    }
    
}
