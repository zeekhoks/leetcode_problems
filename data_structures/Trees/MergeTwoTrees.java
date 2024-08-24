package data_structures.Trees;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MergeTwoTrees {

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

    public static void traversePreOrder(StringBuilder sb, TreeNode node) {
        if (node != null) {
            sb.append(node.val);
            sb.append("\n");
            traversePreOrder(sb, node.left);
            traversePreOrder(sb, node.right);
        }
    }

    public static void printTree(PrintStream os, TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traversePreOrder(sb, root);
        os.print(sb.toString());
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return null;
        else if (root1 == null)
            return root2;
        else if (root2 == null)
            return root1;
        else {
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
            return root1;
        }
    }

    public static void main(String[] args) {

        MergeTwoTrees solution = new MergeTwoTrees();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = null;
        root1.left.left = new TreeNode(3);
        root1.left.right = null;
        // root1.right.left = null;
        // root1.right.right = null;

        TreeNode root2 = new TreeNode(1);
        root2.left = null;
        root2.right = new TreeNode(2);
        // root2.left.left= null;
        // root2.left.right=new TreeNode(4);;
        root2.right.left = null;
        root2.right.right = new TreeNode(3);

        TreeNode result = solution.mergeTrees(root1, root2);

        System.out.println("Answer : ");
        MergeTwoTrees.printTree(System.out, result);
    }

}
