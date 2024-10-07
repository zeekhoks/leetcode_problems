package data_structures.Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {

        int[] stocks = { 100, 80, 60, 70, 60, 75, 85 };
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = stocks.length;
        int[] result = new int[n];

        for (int i=0; i<n; i++) {
            map.put(stocks[i], i);
        }

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                result[i] = 1;
            } else if (!stack.isEmpty() && stack.peek() > stocks[i]) {
                result[i] = i - map.get(stack.peek());
            } else if (!stack.isEmpty() && stack.peek() <= stocks[i]) {
                while(!stack.isEmpty() && stack.peek() <= stocks[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result[i] = 1;
                } else {
                    result[i] = i - map.get(stack.peek());                
                }
            }
            stack.push(stocks[i]);
        }

        for(int i=0; i<n; i++){
            System.out.print(result[i] + " ");
        }
    }

}
