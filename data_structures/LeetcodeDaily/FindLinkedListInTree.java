package data_structures.LeetcodeDaily;

public class FindLinkedListInTree {

    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public FindLinkedListInTree() {
        this.head = null;
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
       return dfs(head, head, root);
    }

    public boolean dfs(ListNode current, ListNode head, TreeNode root){
        if(root == null) {
            return false;
        }

        if(current == null){
            return true;
        }

        if(current.data == root.val){
            current = current.next;
        } else if(head.data == root.val){
            head= head.next;
        } else {
            current = head;
        }

        return dfs(current, head, root.left) || dfs(current, head, root.right);
        
    }


    public static void main(String[] args) {

        FindLinkedListInTree solution = new FindLinkedListInTree();

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);
        
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        
        root.left.right.left = new TreeNode(1);
        
        root.left.right.left.left = new TreeNode(6);
        root.left.right.left.right = new TreeNode(8);
        
        root.right.left.left = new TreeNode(1);
        root.right.left.right = new TreeNode(3);

        boolean result = solution.isSubPath(head, root);

        System.out.println("Does the binary tree contain a downward path with this list? " + result);
    }
}
