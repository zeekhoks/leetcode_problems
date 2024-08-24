package data_structures.Trees;

import java.io.PrintStream;

public class PathSum {

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
    

    public boolean hasPathSum(TreeNode root, int targetSum) {

        boolean result = helper(root, targetSum, false, 0);
        return result;
    }

    public boolean helper(TreeNode root, int targetSum, boolean result, int sum) {

        if (root == null) {
            return false;
        } 
        sum += root.val;
        if(root.left != null && root.right!=null)
            return sum == targetSum;

        return (helper(root.left, targetSum, result, sum) || helper(root.right, targetSum, result, sum));

    }

    public static void main(String[] args) {

        PathSum solution = new PathSum();

        int targetSum = 1;

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        // root.left = new TreeNode(4);
        // root.right = new TreeNode(8);
        // root.left.left = new TreeNode(11);
        // root.left.right = null;
        // root.right.left = new TreeNode(13);
        // root.right.right = new TreeNode(4);
        // root.left.left.left = new TreeNode(7);
        // root.left.left.right = new TreeNode(2);
        // root.right.left.left = null;
        // root.right.left.right = null;
        // root.right.right.left = null;
        // root.right.right.right = new TreeNode(1);

        boolean result = solution.hasPathSum(root, targetSum);

        System.out.println("Answer : " + result);
        // PathSum.printTree(System.out, result);
    }

}
