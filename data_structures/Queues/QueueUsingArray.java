package data_structures.Queues;


public class QueueUsingArray {

    private int arr[];
    private int start, end, count, maxSize;

    QueueUsingArray(int maxSize) {
        arr = new int[maxSize];
        this.maxSize = maxSize;
        start = 0;
        end = 0;
        count = 0;
    }

    public void push(int x) {
        if (count == maxSize) {
            System.out.println("Queue is full, pop some elements to push more in!");
            // System.exit(1);
        }
        if (count < maxSize) {
            arr[end%maxSize] = x;
            end++;
            count++;
        }
    }

    public int pop() {
        int temp = 0;
        if (count == 0) {
            System.out.println("Queue is empty, cannot pop elements!");
            return -1;
        }
        if(count>0){
            temp = arr[start%maxSize];
            start++;
            count--;
        }
        return temp;
    }

    public void display() {
        if(count!=0){
            for (int i = 0; i <maxSize; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        } else {
            for (int i = start; i <maxSize; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
        
    }

    public int size(){
        return count;
    }

    public int top(){
        if(start==0){
            System.out.println("Queue is empty, nothing to return!");
        }
        return arr[start];
    }

    public static void main(String[] args) {

        System.out.println("Initializing a queue: ");
        QueueUsingArray queue = new QueueUsingArray(6);
        queue.push(6);
        queue.push(1);
        queue.push(8);
        queue.push(9);
        queue.push(10);
        queue.push(12);
        System.out.println("Top of the queue is: " + queue.top());
        System.out.println("Current queue is: ");
        queue.display();
        System.out.println("Size before pop: " + queue.size());
        System.out.println("Element to be popped from the beginning of the queue is: "  + queue.pop());
        System.out.println("Size after pop: " + queue.size());

        queue.push(15);
        
        System.out.println("Element to be popped from the beginning of the queue is: "  + queue.pop());
        System.out.println("Size after pop: " + queue.size());

        queue.push(23);

        
        System.out.println("Element to be popped from the beginning of the queue is: "  + queue.pop());
        System.out.println("Element to be popped from the beginning of the queue is: "  + queue.pop());
        System.out.println("Element to be popped from the beginning of the queue is: "  + queue.pop());

        System.out.println("Size after pop: " + queue.size());
        

    }

}
