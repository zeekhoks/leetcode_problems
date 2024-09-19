package data_structures.LeetcodeDaily;

import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {

        int[] nums = { 0, 0 };
        String result = "";

        String[] arr = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(arr, new Comparator<String>() {

            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }

        });

        for (String s : arr) {
            result = result + s;
        }

        if (Integer.valueOf(result).equals(0)) {
            result = "";
            result += "0";
        }

        System.out.println("The largest number is => " + result);
    }
}
