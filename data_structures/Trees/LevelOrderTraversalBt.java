package data_structures.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversalBt {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;
        
        queue.add(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<n;i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            result.add(level);
        }
        return result;
    }


    public static void main(String[] args) {

        LevelOrderTraversalBt solution = new LevelOrderTraversalBt();
        List<List<Integer>> results = new ArrayList<>();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left=null;
        root.left.right=null;
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        results = solution.levelOrder(root);
        
        System.out.println("Answer : ");
        results.forEach(result -> System.out.println(result));
    }
}
