package data_structures.LeetcodeDaily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankArray {

    public static void main(String[] args) {

        int[] arr = { 37, 12, 28, 9, 100, 56, 80, 5, 12 };
        int[] check = new int[arr.length];
        int[] result = new int[arr.length];

        check = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            
            map.put(arr[i], i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int t = map.get(check[i]);
            result[i] = t;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
