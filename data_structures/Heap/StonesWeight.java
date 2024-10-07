package data_structures.Heap;

import java.util.*;

public class StonesWeight {

    public static void main(String[] args) {

        int[] stones = { 2, 7, 4, 1, 8, 1 };

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            minHeap.add(stones[i]);
        }

        while (minHeap.size() > 0){
            if(minHeap.size() == 1) System.out.println("The last stone's weight is => " + minHeap.peek());

            int y = minHeap.poll();
            int x = minHeap.poll();
            if(y!=x){
                y = y-x;
                minHeap.add(y);
            }
        }


        System.out.println("The last stone's weight is => " + 0);

    }
}
