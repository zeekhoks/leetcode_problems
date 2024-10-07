package data_structures.Stacks;

import java.util.Stack;

public class NearestSmallerElementRight {

    public static void main(String[] args) {

        int[] nums = { 4, 5, 2, 10, 8 };
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result[i] = -1;
            } else if (!stack.isEmpty() && stack.peek() < nums[i]) {
                result[i] = stack.peek();
            } else if (!stack.isEmpty() && stack.peek() >= nums[i]) {
                while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
            }
            stack.push(nums[i]);
        }

        for(int i=0; i<n; i++){
            System.out.println(result[i] + "");
        }
    }
}
