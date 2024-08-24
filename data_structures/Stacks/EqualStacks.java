package data_structures.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EqualStacks {

    public static void main(String[] args) {
        Stack<Integer> h1 = new Stack<>();
        h1.push(1);
        h1.push(1);
        h1.push(1);
        h1.push(2);
        h1.push(3);

        Stack<Integer> h2 = new Stack<>();
        h2.push(2);
        h2.push(3);
        h2.push(4);
       
        Stack<Integer> h3 = new Stack<>();
        h3.push(1);
        h3.push(4);
        h3.push(1);
        h3.push(1);

        int sum1 = sumOfHeights(h1);
        int sum2 = sumOfHeights(h2);
        int sum3 = sumOfHeights(h3);
      


        while(sum1!=sum2 || sum2!=sum3){
            if(sum1>=sum2 && sum1>=sum3){
                sum1-=h1.pop();
            } else if (sum2>=sum3 && sum2>=sum1){
                sum2-=h2.pop();
            } else if(sum3>=sum2 && sum3>=sum1){
                sum3-=h3.pop();
            }
        }

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);


    }

    public static int sumOfHeights(Stack<Integer> stack){
        int sum = 0;
        int i = 0;
        while(i<stack.size()){
            sum+=stack.get(i);
            i++;
        }
        return sum;
    }
    
}
