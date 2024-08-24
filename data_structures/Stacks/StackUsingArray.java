package data_structures.Stacks;

public class StackUsingArray {

    private int[] array;
    private int current, maxSize;

    StackUsingArray(int maxSize){
        this.maxSize = maxSize;
        array = new int[maxSize];
        current = 0;
    }

    public void push(int x){
        if(array.length==0){
            System.out.println("Stack is empty, create a new stack!");
        } else if(current <= maxSize){
            array[current]=x;
            current++;
        }else{
            System.out.println("Stack is full, please pop elements to add more!");
        }
    }

    public int pop(){
        if(current==0){
            System.out.println("Stack is empty, please push elements to the stack!");
            return -1;
        }else{
            int temp = array[current-1];
            current--;
            return temp;
        }    
    }

    public int size(){
        return current;
    }

    public int top(){
        if(current==0){
            System.out.println("The stack is empty, nothing to return.");
            return -1;
        } else{
            return array[current-1];
        }
    }

    public void display(){
        if(current==0) System.out.println("The stack is empty, nothing to display!");
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        StackUsingArray stack = new StackUsingArray(6);
        stack.push(5);
        stack.push(14);
        stack.push(25);
        stack.push(78);
        stack.push(9);
        stack.push(94);

        System.out.println("The peek at the top element of the stack: " + stack.top());
        stack.display();
        System.out.println("Size before pop: " + stack.size());
        System.out.println("Element to be popped from the beginning of the stack is: "  + stack.pop());
        System.out.println("Size after pop: " + stack.size());

        System.out.println("Pushing 66");
        // stack.display();
        stack.push(66);

        System.out.println("Size before pop: " + stack.size());
        System.out.println("Element to be popped from the beginning of the stack is: "  + stack.pop());
        System.out.println("Size after pop: " + stack.size());

        // System.out.println("Current stack is: ");
        // stack.display();

    }
    
}
