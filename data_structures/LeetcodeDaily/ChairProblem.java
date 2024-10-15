package data_structures.LeetcodeDaily;

import java.util.*;

public class ChairProblem {

    public static void main(String[] args) {

        int[][] times = {
                { 33889, 98676 },
                { 80071, 89737 },
                { 44118, 52565 },
                { 52992, 84310 },
                { 78492, 88209 },
                { 21695, 67063 },
                { 84622, 95452 },
                { 98048, 98856 },
                { 98411, 99433 },
                { 55333, 56548 },
                { 65375, 88566 },
                { 55011, 62821 },
                { 48548, 48656 },
                { 87396, 94825 },
                { 55273, 81868 },
                { 75629, 91467 }
        };
        int targetFriend = 6;
        int minAvailableChair = 0;
        int n = times.length;

        List<int[]> arrivals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrivals.add(new int[] { times[i][0], i });
        }

        arrivals.sort((a, b) -> (Integer.compare(a[0], b[0])));

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            availableChairs.add(i);
        }

        PriorityQueue<int[]> leavingQueue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int[] arrival : arrivals) {

            int arrivalTime = arrival[0];
            int friendIndex = arrival[1];
            int departTime = times[friendIndex][1];

            if (!leavingQueue.isEmpty() && leavingQueue.peek()[0] <= arrivalTime) {
                availableChairs.add(leavingQueue.poll()[1]);
            }

            int chair = availableChairs.poll();

            if (friendIndex == targetFriend) {
                minAvailableChair = chair;
                break;
            }

            leavingQueue.add(new int[] { departTime, chair });
        }

        System.out.println("The min available chair for friend index is -> " + minAvailableChair);

    }

}
