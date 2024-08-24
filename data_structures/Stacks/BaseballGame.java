package data_structures.Stacks;

import java.util.*;

public class BaseballGame {

    public static void main(String[] args) {

        String[] operations = { "5", "2", "C", "D", "+" };
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (!stack.isEmpty()) {
                if (operations[i] == "C") {
                    stack.pop();
                } else if (operations[i] == "D") {
                    stack.push(stack.peek() * 2);
                } else if (operations[i] == "+") {
                    int a = stack.pop();
                    int b = stack.pop();
                    int c = a + b;
                    stack.push(b);
                    stack.push(a);
                    stack.push(c);
                } else {
                    stack.push(Integer.parseInt(operations[i]));
                }
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println("The final baseball score is : " + sum);

    }

}
