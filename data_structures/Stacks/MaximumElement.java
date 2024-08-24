package data_structures.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumElement {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        List<Integer> result = new ArrayList<>();
        List<String> ops = new ArrayList<>();
        int x = 0;
        int max =0;

        ops.add("1 97");
        ops.add("2");
        ops.add("1 20");
        ops.add("2");
        ops.add("1 26");
        ops.add("1 20");
        ops.add("2");
        ops.add("3");
        ops.add("1 91");
        ops.add("3");

        for(String e: ops){
            String[] arr = e.split(" ");
            if(arr[0].equals("1")){
                x = Integer.parseInt(arr[1]);
                stack.push(x);
            } else if(arr[0].equals("2")){
                stack.pop();
            } else if(arr[0].equals("3")){
                for(int i=0; i<stack.size(); i++){
                    if(stack.get(i)>max){
                        max=stack.get(i);
                    }
                }
                result.add(max);
            }
            
        }
        System.out.println(result);



    }
    
}
