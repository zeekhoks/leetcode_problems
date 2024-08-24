package data_structures.Stacks;

import java.util.Stack;

public class ReversePolish {

    public static int operation(int a, int b, String operator){
        int result = 0;
        switch (operator) {
            case "+":
                result = a+b;
                break;
            case "-":
                if(b>a){
                    result=b-a;
                    break;
                } else {
                    result=a-b;
                    break;
                }
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
            default:
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        Stack<Integer> numberStack = new Stack<>();
        // Stack<String> operatorStack = new Stack<>();
        int i=0, value=0;
        while(i<tokens.length){
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                if(!numberStack.isEmpty()){
                    int b = numberStack.pop();
                    int a = numberStack.pop();
                    value = operation(a, b, tokens[i]);
                    numberStack.push(value);
                }
            } else {
                numberStack.push(Integer.parseInt(tokens[i]));
            }
            i++;
        }

        System.out.println("The result of the reverse polish notation is: " + value);
    }
    
}
