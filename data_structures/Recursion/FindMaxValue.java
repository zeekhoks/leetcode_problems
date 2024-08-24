package data_structures.Recursion;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        List<Integer> givenList = new ArrayList<Integer>();
        givenList.add(20);
        givenList.add(98);
        givenList.add(106);
        givenList.add(10);
        givenList.add(40);
        givenList.add(434792);
        int result = findMax(givenList, 0);
        System.out.println("The maximum value in the list after recursion is: " + result);
    }

    public static int findMax(List<Integer> list, int i){

        // Wrong approach
        // int possible_max_1 = list.get(i);
        // int possible_max_2 = findMax(list, i+1);
        // if(i==list.size()-1){
        //     return Integer.MAX_VALUE;
        // } else if (possible_max_1>possible_max_2){
        //     return possible_max_1;
        // } else {
        //     return possible_max_2;
        // }

        if(i<list.size()){
            int possible_max_1 = list.get(i);
            int possible_max_2 = findMax(list, i+1);
            if (possible_max_1>possible_max_2){
                return possible_max_1;
            } else {
                return possible_max_2;
            }
        } else {
            return Integer.MIN_VALUE;
        }

    }
}
