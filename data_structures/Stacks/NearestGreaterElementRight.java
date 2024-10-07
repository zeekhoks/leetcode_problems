package data_structures.Stacks;

import java.util.*;

public class NearestGreaterElementRight {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 0, 0, 2, 4 };
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                result[i] = -1;
            } else if (!stack.isEmpty() && (stack.peek() > arr[i])) {
                result[i] = stack.peek();
            } else if (!stack.isEmpty() && (stack.peek() <= arr[i])) {
                while (!stack.isEmpty() && (stack.peek() <= arr[i])) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
            }
            stack.push(arr[i]);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
