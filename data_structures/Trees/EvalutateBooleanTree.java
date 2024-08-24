package data_structures.Trees;

public class EvalutateBooleanTree {

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

    public boolean evaluateTree(TreeNode root) {
        boolean result1 = false;
        boolean result2 = true;

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            if (root.val == 0) {
                return result1;
            } else if (root.val == 1) {
                return result2;
            }
        }

        if (root.val == 3) {
            boolean a1 = evaluateTree(root.left);
            boolean a2 = evaluateTree(root.right);
            return a1 && a2;
        }

        if (root.val == 2) {
            boolean a1 = evaluateTree(root.left);
            boolean a2 = evaluateTree(root.right);
            return a1 || a2;
        }

        return false;

    }

    public static void main(String[] args) {

        EvalutateBooleanTree solution = new EvalutateBooleanTree();

        // Create the first tree root = [2,1,3,null,null,0,1]
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        boolean result = solution.evaluateTree(root);

        System.out.println("Answer : " + result);
    }

}
