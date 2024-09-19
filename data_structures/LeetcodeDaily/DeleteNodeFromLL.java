package data_structures.LeetcodeDaily;

import data_structures.LinkedList.ReorderList;
import java.util.*;

public class DeleteNodeFromLL {
    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public DeleteNodeFromLL() {
        this.head = null;
    }

    public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }

        if(head==null) return null;

        head.next = modifiedList(nums, head.next);
        return set.contains(head.data)?head.next:head;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
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

    public static void main(String[] args) {

        int[] nums = { 1 };

        DeleteNodeFromLL list1 = new DeleteNodeFromLL();

        list1.insertAtEnd(1);
        list1.insertAtEnd(2);
        list1.insertAtEnd(1);
        list1.insertAtEnd(2);
        list1.insertAtEnd(1);
        list1.insertAtEnd(2);

        System.out.println("Original linked list 1: ");
        list1.display();

        ListNode result = list1.modifiedList(nums, list1.head);

        System.out.println("List after selected nodes have been removed : ");
        // result.display();

    }

}
