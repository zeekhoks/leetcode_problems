package data_structures.Stacks;

import java.util.*;

public class NearestGreaterElementLeft {

    public static void main(String[] args) {

        int[] nums = { 1, 3, 2, 4 };
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                result[i] = -1;
            } else if (!stack.isEmpty() && stack.peek() > nums[i]) {
                result[i] = stack.peek();
            } else if (!stack.isEmpty() && stack.peek() < nums[i]) {
                while (!stack.isEmpty() && stack.peek() < nums[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
            }

            stack.push(nums[i]);
        }

        for(int i=0; i<n; i++){
            System.out.print(result[i] + "");
        }
    }

}
