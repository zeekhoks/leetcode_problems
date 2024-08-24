package data_structures.Stacks;

import java.util.*;

public class DailyTemperatures {

    public static void main(String[] args) {

        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] answer = new int[temperatures.length];

        // Stack<Integer> stack = new Stack<>();

        // for (int i = 0; i < temperatures.length; i++) {

        // while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        // answer[stack.peek()] = i - stack.pop();
        // }
        // stack.push(i);
        // }

        int hottest = 0;
        for (int currDay = temperatures.length - 1; currDay >= 0; currDay--) {
            int currentTemp = temperatures[currDay];
            if (currentTemp > hottest) {
                hottest = currentTemp;
                continue;
            }

            int days = 1;
            while(temperatures[currDay + days] <= currentTemp){
                days += answer[currDay + days];
            }
            answer[currDay] = days;
        }

        System.out.println("Resulting array of daily temperatures : ");
        for (int m = 0; m < answer.length; m++) {
            System.out.print(answer[m] + " ");
        }

    }

}
