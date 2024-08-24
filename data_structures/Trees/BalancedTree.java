package data_structures.Trees;

public class BalancedTree {
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


    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lh = dfs(root.left);
        int rh = dfs(root.right);
        if(Math.abs(lh-rh)>1) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    private int dfs(TreeNode root){
        
        if(root==null)return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        return 1 + Math.max(left,right);
    }

    public static void main(String[] args) {

        BalancedTree solution = new BalancedTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = null;
        root.right.left = null;
        root.right.right = new TreeNode(3);
        root.left.left.left=new TreeNode(4);
        root.left.left.right=null;
        root.right.right.left=null;
        root.right.right.right=new TreeNode(4);

        boolean result = solution.isBalanced(root);
        System.out.println("Is the tree balanced? Answer : " + result);
    }
}
