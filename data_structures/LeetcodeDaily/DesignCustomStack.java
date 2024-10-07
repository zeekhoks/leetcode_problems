package data_structures.LeetcodeDaily;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DesignCustomStack {

    private Queue<Integer> queue;
    private int capacity;

    public DesignCustomStack(int maxSize) {
        queue = new LinkedList<>();
        capacity = maxSize;
    }

    public void push(int x) {
        if (queue.size() == capacity) {
            return;
        } else {
            queue.offer(x);
        }
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }

    public void increment(int k, int val) {

        int n = queue.size();
        int diff = n - k;

        if (k < n) {
            for (int i = 0; i < diff; i++) {
                queue.offer(queue.poll());
            }
            for (int i = 0; i < k; i++) {
                queue.offer(queue.poll() + val);
            }
        } else if(k>=n){
            for (int i = 0; i < n; i++) {
                queue.offer(queue.poll() + val);
            }
        }

    }

    public static void main(String[] args) {

        int maxSize = 12;
        DesignCustomStack customStack = new DesignCustomStack(maxSize);

        customStack.push(83);
        customStack.increment(2, 60);
        customStack.increment(9, 61);
        customStack.increment(1, 60);

        customStack.push(82);
        customStack.push(21);
        customStack.push(58);

        customStack.increment(8, 8);

        customStack.push(22);
        customStack.push(80);

        customStack.increment(1, 64);

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());

        customStack.push(24);

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());

    }
}
