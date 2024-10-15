package data_structures.LeetcodeDaily;

import java.util.*;

public class MinStringLengthAfterRemovingSubs {
    public static void main(String[] args) {

        String s = "ACBBD";

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                stack.push('A');
            } else if (c == 'C') {
                stack.push('C');
            } else if(stack.peek() == 'A' && c == 'B'){
                stack.pop();
            } else if(stack.peek() == 'C' && c == 'D') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        System.out.println("The length of the string is => " + stack.size());

    }
}