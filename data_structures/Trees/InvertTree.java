package data_structures.Trees;

import java.io.PrintStream;

public class InvertTree {

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

    public TreeNode invertBinaryTree(TreeNode root){

        if(root==null)return root;
        TreeNode left = invertBinaryTree(root.left);
        TreeNode right = invertBinaryTree(root.right);

        root.right=left;
        root.left=right;

        return root;

    }

    public static void main(String[] args) {

        InvertTree solution = new InvertTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode result = solution.invertBinaryTree(root);
        System.out.println("The inverted tree is here: ");
        InvertTree.printTree(System.out, result);
    }
    
}
