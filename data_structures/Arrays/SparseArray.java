package data_structures.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class SparseArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ab");
        stringList.add("ab");
        stringList.add("abc");

        Map<String,Integer> countMap = new HashMap<String,Integer>();
        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");
        List<Integer> result = new ArrayList<>();

        for(String s : stringList){
            if(countMap.containsKey(s)){
                countMap.put(s, countMap.get(s) + 1);
            } else {
                countMap.put(s, 1);
            }
        }

        for(int i=0; i<queries.size(); i++){
            if(countMap.containsKey(queries.get(i))){
                result.add(countMap.get(queries.get(i)));
            } else {
                result.add(0);
            }
        }

        result.forEach(System.out::println);

        // for(Map.Entry<String,Integer> entry: countMap.entrySet()){
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }




    }
}
