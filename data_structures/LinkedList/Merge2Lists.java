package data_structures.LinkedList;

public class Merge2Lists {

    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Merge2Lists() {
        this.head = null;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtBeginning(int data) {
        ListNode newListNode = new ListNode(data);
        newListNode.next = head;
        head = newListNode;
    }

    public void insertAtEnd(int data) {
        ListNode newListNode = new ListNode(data);
        if (head == null) {
            head = newListNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newListNode;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                tail.next=list1;
                list1=list1.next;
            } else{
                tail.next=list2;
                list2=list2.next;
            }
            tail = tail.next;
        }
        
        if(list1!=null){
            tail.next=list1;
            list1=list1.next;
        } else {
            tail.next=list2;
            list2=list2.next;
        }
        
        return dummy.next;
       
    }

    public static void main(String[] args) {
        Merge2Lists kList1 = new Merge2Lists();
        Merge2Lists kList2 = new Merge2Lists();

        kList1.insertAtEnd(1);
        kList1.insertAtEnd(2);
        kList1.insertAtEnd(4);

        kList2.insertAtEnd(1);
        kList2.insertAtEnd(3);
        kList2.insertAtEnd(4);

        System.out.println("Original linked list 1: ");
        kList1.display();
        System.out.println("Original linked lis2 1: ");
        kList2.display();

        ListNode listMerged = mergeTwoLists(kList1.head, kList2.head);

        System.out.println("Merged ListNode: " + listMerged.data);

    }

}
