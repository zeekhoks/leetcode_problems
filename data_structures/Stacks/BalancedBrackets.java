package data_structures.Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        
        Stack<Character> stack = new Stack<Character>();
        String s = "{([])}";

        
        for(char c:s.toCharArray()){
            if(c == '{'){
                stack.push('}');
            } else if(c==' '){
                System.out.println("YES");
            }
            else if(c == '[') {
                stack.push(']');
            } else if(c == '('){
                stack.push(')');
            } else if(stack.isEmpty()||stack.pop()!=c) {
                System.out.println("NO");
                break;
            } 
        }
        System.out.println("YES");

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()) System.out.println("NO");
            char check;

            switch(c){
                case')':
                    check=stack.pop();
                    if(check == '{' || check == '[')System.out.println("NO");
                    break;
                case']':
                    check=stack.pop();
                    if(check == '{' || check == '(')System.out.println("NO");
                    break;
                case'}':
                    check=stack.pop();
                    if(check == '(' || check == '[')System.out.println("NO");
                    break;
            }
            
        }
        System.out.println("YES");
    }
    
}
