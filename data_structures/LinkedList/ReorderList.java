package data_structures.LinkedList;

public class ReorderList {
    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ReorderList() {
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

    public static void reorderList(ListNode head){
        if(head==null || head.next==null) return;

        ListNode l1 = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow =slow.next;
            fast=fast.next.next;
        }

        prev.next = null;
        ListNode l2 = reverse(slow);
        merge(l1, l2);

    }

    public static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }


    public static void merge (ListNode l1, ListNode l2){
        while(l1 != null){
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;

            l1.next = l2;
            if(l1_next == null){
                break;
            }
            l2.next = l1_next;
            l1 = l1_next;
            l2 = l2_next;
        }
    }

    public static void main(String[] args) {
        ReorderList kList1 = new ReorderList();

        kList1.insertAtEnd(1);
        kList1.insertAtEnd(2);
        kList1.insertAtEnd(3);
        kList1.insertAtEnd(4);

        System.out.println("Original linked list 1: ");
        kList1.display();

        reorderList(kList1.head);

        System.out.println("Reordered List : " );
        kList1.display();

    }
}
