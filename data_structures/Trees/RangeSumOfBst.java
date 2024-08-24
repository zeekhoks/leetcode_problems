package data_structures.Trees;

public class RangeSumOfBst {
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

    public int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null)
            return 0;

        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        } else if (root.val > high){
            return rangeSumBST(root.left, low, high);
        } else {
            return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
        }
    }

    public static void main(String[] args) {

        RangeSumOfBst solution = new RangeSumOfBst();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);
        root.left.left.left = new TreeNode(1);
        root.left.left.right = null;
        root.left.right.left = new TreeNode(6);
        root.left.right.right = null;

        // root.right.left.left = null;
        // root.right.left.right = null;
        // root.right.right.left = null;
        // root.right.right.right = new TreeNode(1);

        int result = solution.rangeSumBST(root, 6, 10);

        System.out.println("Answer : " + result);
        // PathSum.printTree(System.out, result);
    }
}
