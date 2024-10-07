package data_structures.LinkedList;

public class DeepCopyList {

    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;
        ListNode random;

        ListNode(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }

    }

    public DeepCopyList() {
        this.head = null;
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

    public ListNode copyRandomList(ListNode head) {

        ListNode current = head;
        while (current != null) {
            ListNode copy = new ListNode(current.data);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        current=head;

        while(current!=null){
            ListNode copy = current.next;
            copy.random = (current.random!=null) ? current.random.next : null;
            current = copy.next;
        }

        ListNode original = head;
        ListNode copyHead = head.next;
        ListNode copy = copyHead;

        while(original!=null){
            original.next = copy.next;
            original = original.next;

            while(original!=null){
                copy = original.next;
                copy=copy.next;
            }
        }
        copy.next=null;
        return copyHead;

    }

    // Utility function to print the list
    private static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print("Node value: " + temp.data);
            if (temp.random != null) {
                System.out.print(", Random points to: " + temp.random.data);
            } else {
                System.out.print(", Random points to: null");
            }
            System.out.println();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DeepCopyList list = new DeepCopyList();

        list.insertAtEnd(7);
        list.insertAtEnd(13);
        list.insertAtEnd(11);
        list.insertAtEnd(10);
        list.insertAtEnd(1);

        ListNode curr = list.head;

        curr.random = null;
        curr.next.random = curr;
        curr.next.next.random = curr.next.next.next.next;
        curr.next.next.next.random = curr.next.next;
        curr.next.next.next.next.random = curr;

        // Print the original and copied list for testing
        System.out.println("Original List:");
        printList(list.head);
        System.out.println("\nCopied List:");
        // printList(copiedListHead);
    }

}
