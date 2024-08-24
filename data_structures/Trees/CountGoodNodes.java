package data_structures.Trees;

import java.util.ArrayList;
import java.util.List;

public class CountGoodNodes {
    
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
    
    public int goodNodes(TreeNode root) {
        int result = dfs(root, root.val);
        return result;

    }

    public int dfs(TreeNode root, int globalMax){
        int count = 0;
        if(root==null){
            return 0;
        }

        if(root.val>=globalMax){
            count = 1;
            globalMax = Math.max(globalMax, root.val);
        } else {
            count = 0;
        }

        count+=dfs(root.left, globalMax);
        count+=dfs(root.right, globalMax);
        return count;
    }

    public static void main(String[] args) {

        CountGoodNodes solution = new CountGoodNodes();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left=new TreeNode(3);
        root.left.right=null;
        root.right.left = new TreeNode(1);;
        root.right.right = new TreeNode(5);

        int result = solution.goodNodes(root);
        
        System.out.println("Answer : " + result);
    }
}
