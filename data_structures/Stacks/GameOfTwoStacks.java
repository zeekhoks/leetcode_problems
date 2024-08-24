package data_structures.Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class GameOfTwoStacks {
    
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        a.add(4);
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(1);

        b.add(2);
        b.add(1);
        b.add(8);
        b.add(5);
        
        // Stack<Integer> stack1 = new Stack<>();
        // Stack<Integer> stack2 = new Stack<>();

        // stack1.addAll(a);
        // stack2.addAll(b);

        // int maxSum = 10, sum=0, count=0;
        // while(sum<=maxSum){
        //     if(stack1.peek()<stack2.peek()){
        //         sum+=stack1.pop();
        //     } else {
        //         sum+=stack2.pop();
        //     }
        //     count++;
        //     sum++;
        // }

        int count = solve(a, b, 10);

        System.out.println("The number of integers which add up to the sum is: " + count);
        

    }

    static int solve(List<Integer> a, List<Integer> b, int x) {
		int lengthB = 0;
		int sum = 0;
		while (lengthB < b.size() && sum + b.get(lengthB) <= x) {
			sum += b.get(lengthB);
			lengthB++;
		}

		int maxScore = lengthB;
		for (int lengthA = 1; lengthA <= a.size(); lengthA++) {
			sum += a.get(lengthA-1);

			while (sum > x && lengthB > 0) {
				lengthB--;
				sum -= b.get(lengthB);
			}

			if (sum > x) {
				break;
			}

			maxScore = Math.max(maxScore, lengthA + lengthB);
		}
		return maxScore;
	}
}
