package data_structures.Trees;

import java.util.Stack;

public class ValidBST {

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

    public boolean isValidBST(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        double leftVal = -Double.MAX_VALUE;

        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(root.val <= leftVal) return false;
            leftVal = root.val;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {

        ValidBST solution = new ValidBST();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(2);
        root.right.left = new TreeNode(5);;
        root.right.right = new TreeNode(6);

        boolean result = solution.isValidBST(root);
        
        System.out.println("Answer : " + result);
    }
    
}
