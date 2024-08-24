package data_structures.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KthSmallest {

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

    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<Integer>();

        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root=stack.pop();
            list.add(root.val);
            root=root.right;
        }

        return list.get(k-1);
        
    }

    public static void main(String[] args) {

        KthSmallest solution = new KthSmallest();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.right.left = null;
        root.right.right = null;
        root.left.left.left = new TreeNode(1);

        int result = solution.kthSmallest(root, 3);
        
        System.out.println("Answer : " + result);
    }
    
}
