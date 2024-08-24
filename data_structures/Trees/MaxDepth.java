package data_structures.Trees;

public class MaxDepth {

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

    public int findMaxDepth(TreeNode root) {
        int depth = 0;

        if(root==null) return 0;

        int leftDepth = findMaxDepth(root.left);
        int rightDepth = findMaxDepth(root.right);

        depth = Math.max(leftDepth,rightDepth)+1;

        return depth;
    }

    public static void main(String[] args) {

        MaxDepth solution = new MaxDepth();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = solution.findMaxDepth(root);
        System.out.println("The max depth is : " + result);
    }

    
}
