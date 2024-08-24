package data_structures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        int lastAnswer = 0;
        int n = 2;
        List<Integer> arr = Arrays.asList(new Integer[n]);
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1,0,5));
        queries.add(Arrays.asList(1,1,7));
        queries.add(Arrays.asList(1,0,3));
        queries.add(Arrays.asList(2,1,0));
        queries.add(Arrays.asList(2,1,1));

        System.out.println(queries.size());

        for(int i=0; i<queries.size(); i++){
            for(int j=0; j<i; j++){
                if(queries.get(i).get(0) == 1){
                    int idx = ((queries.get(i).get(1)^lastAnswer)%2);
                    

                }
            }
        }

    }
}
