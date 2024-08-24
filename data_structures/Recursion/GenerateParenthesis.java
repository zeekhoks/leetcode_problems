package data_structures.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {
    
    public static void main(String[] args) {
        List<String> outputArr = new ArrayList<>();
        // List<String> temp = new ArrayList<>();
        int n = 3, open=0, close=0;
        Stack<String> stack = new Stack<>();
        backtrack(outputArr, n, open, close, stack);
        System.out.println(outputArr.toString());
    }

    public static void backtrack(List<String> outputArr, int n, int open, int close, Stack<String> stack){

        if(close == n && open == n){
            String result = "";
            for(String s: stack){
                result+=s;
            }
            outputArr.add(result);
            return;
        }
        if(open<n){
            stack.push("(");
            backtrack(outputArr, n, open+1, close, stack);
            stack.pop();
        }
        if(close<open){
            stack.add(")");
            backtrack(outputArr, n, open, close+1, stack);
            stack.pop();
        }
    }
    
}


// package hackerrank.Recursion;

// import java.util.ArrayList;
// import java.util.List;

// public class GenerateParenthesis {
    
//     public static void main(String[] args) {
//         List<String> outputArr = new ArrayList<>();
//         int n = 3;
//         backtrack(outputArr, new StringBuilder(), 0,0,n);
//         System.out.println(outputArr.toString());
//     }

//     public static void backtrack(List<String> outputArr, StringBuilder currentString, int open, int close, int max){
//         if(currentString.length()==max*2){
//             outputArr.add(currentString.toString());
//             return;
//         }
//         if(open<max) backtrack(outputArr, currentString.append("("), open+1, close, max);
//         if(close<open) backtrack(outputArr, currentString.append(")"), open, close+1, max);

//     }
    
// }
