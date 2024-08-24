package data_structures.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {

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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(); 
        
        if (root == null) return results;
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            TreeNode rightSide = new TreeNode();
            for(int i=0; i<n; i++){
                TreeNode node = queue.poll();
                rightSide = node;
                if(node.left!=null){
                    queue.add(node.left);
                } if(node.right!=null){
                    queue.add(node.right);
                }
            }
            results.add(rightSide.val);
        }

        return results;
    }

    public static void main(String[] args) {

        RightView solution = new RightView();
        List<Integer> results = new ArrayList<>();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left=null;
        root.left.right=new TreeNode(5);
        root.right.left = null;
        root.right.right = new TreeNode(4);

        results = solution.rightSideView(root);
        
        System.out.println("Answer : ");
        results.forEach(result -> System.out.print(result + " "));
    }
    
}
