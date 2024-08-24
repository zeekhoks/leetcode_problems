package data_structures.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsPartTwo {
    public static void main(String[] args) {
        int[] n = {1,2,2};
        Arrays.sort(n);
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        backtrack(n, 0, arr, new ArrayList<>(),false);
        for(List<Integer> l : arr){
            System.out.println(l.toString());
        }
    }

    // private static void backtrack(int[] n, int start, List<List<Integer>> array, List<Integer> temp){
    //     array.add(new ArrayList<>(temp));
    //     if(temp.size()==n.length){
    //         return;
    //     }
    //     for(int i=start; i<n.length;i++){
    //         if(i>start&&n[i]==n[i-1]) continue;
    //         temp.add(n[i]);
    //         backtrack(n, i+1, array, temp);
    //         temp.remove(temp.size()-1);
    //     }
    // }

    private static void backtrack(int[] n, int start, List<List<Integer>> list, List<Integer> temp, boolean isChosen){
        if(start==n.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        backtrack(n, start+1, list, temp, false);
        if(start>=1&&n[start]==n[start-1]&&!isChosen) return;
        temp.add(n[start]);
        backtrack(n, start+1, list, temp, true);
        temp.remove(temp.size()-1);
    }
}
