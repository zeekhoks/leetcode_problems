package data_structures.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class OneDimensionalArray {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();

            a.add(2);
            a.add(3);
            a.add(4);
            a.add(6);
            a.add(7);
            a.add(9);
            a.add(10);
            a.add(17);

            
            // System.out.println(a.size());
        
        int i=0, j= a.size()-1;

        while(i<j){
            
            Integer temp = a.get(i);
            a.set(i, a.get(j));
            a.set(j, temp);
            i++;
            j--;
        }
        Iterator<Integer> it = a.iterator();
            while(it.hasNext()){
                System.out.print(it.next() + " ");
            }
        
    }
}
