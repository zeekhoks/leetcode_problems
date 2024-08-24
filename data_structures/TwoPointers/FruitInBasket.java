package data_structures.TwoPointers;

import java.util.*;

public class FruitInBasket {

    public static void main(String[] args) {
        int[] fruits = { 0,1,2,2 };
        Map<Integer, Integer> map = new HashMap<>();
        int i=0;
        int j = 0;
        int max = 0;

        while(j<fruits.length){
            map.put(fruits[j], map.getOrDefault(fruits[j], 0)+1);
            
            while(map.size()>2){
                int leftKey = fruits[i];
                int leftValue = map.get(leftKey) - 1;
                map.put(leftKey, leftValue);
                if(map.get(leftKey)==0){
                    map.remove(leftKey);
                }
                i++;
            }

            if(map.size()<=2) 
                max = Math.max(max, j-i+1);

            j++;


        }

        System.out.println("The maximum number of fruits is : " + max);

    }
    
}
