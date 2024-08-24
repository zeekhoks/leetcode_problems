package data_structures.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int[] result = new int[2];
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - num)) {
                result[0] = i;
                result[1] = map.get(target - num);
            }

            map.put(num, i);

        }

        System.out.println("Values are ");
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }

    }

}
