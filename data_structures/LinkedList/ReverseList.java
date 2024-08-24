package data_structures.LinkedList;


public class ReverseList {

    private Node head;

    private static class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ReverseList() {
        this.head = null;
    }

    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insetAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        } 
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next=newNode;
    }

    public Node reverseListNode(ReverseList reverseList){
        Node current = reverseList.head;
        Node prev = null;
        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        ReverseList rList = new ReverseList();
        rList.insertAtEnd(1);
        rList.insertAtEnd(2);
        rList.insertAtEnd(3);
        rList.insertAtEnd(4);
        rList.insertAtEnd(5);
        rList.insertAtEnd(6);
        System.out.println("Original linked list: ");
        rList.display();

        rList.reverseListNode(rList);
        rList.display();

    }
    
}
