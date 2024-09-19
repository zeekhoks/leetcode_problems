package data_structures.LeetcodeDaily;

import java.util.*;

public class UncommonWords {

    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        Map<String, Integer> map = new HashMap<>();
        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < s1Array.length; i++) {
            map.put(s1Array[i],map.getOrDefault(s1Array[i], 0)+1);
        }

        for (int i = 0; i < s2Array.length; i++) {
            map.put(s2Array[i],map.getOrDefault(s2Array[i], 0)+1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                result.add(entry.getKey());
            }
        }

        String[] arr = result.toArray(new String[0]);

        for (String x : arr)
            System.out.print(x + " ");
    }

}
