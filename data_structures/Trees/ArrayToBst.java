package data_structures.Trees;

import java.io.PrintStream;

public class ArrayToBst {

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

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    public TreeNode helper(int[] nums, int low, int high){

        if(low>high){
            return null;
        }

        int mid = low + (high-low)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, low, mid-1);
        root.right = helper(nums, mid+1, high);

        return root;
    }

    public static void traversePreOrder(StringBuilder sb, TreeNode node){
        if(node!=null){
            sb.append(node.val);
            sb.append("\n");
            traversePreOrder(sb, node.left);
            traversePreOrder(sb, node.right);
        }
    }

    public static void printTree (PrintStream os, TreeNode root){
        StringBuilder sb = new StringBuilder();
        traversePreOrder(sb, root);
        os.print(sb.toString());
    }

    public static void main(String[] args) {

        ArrayToBst solution = new ArrayToBst();
        int[] nums = {-10,-3,0,5,9};

        TreeNode result = solution.sortedArrayToBST(nums);
        System.out.println("Answer : " );
        ArrayToBst.printTree(System.out, result);
    }
    
}
