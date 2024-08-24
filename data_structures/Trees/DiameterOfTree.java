package data_structures.Trees;



// Solve this question by finding the diameter and height. The intuition is to start from the lowest node and work upwards, so that we can visit each node only once. The height is -1 for null tree, and 0 for a node. It is 1+max(left, right). The diameter is left+right+2 (the +2 considers the edges). The we update a global maximum diameter.

public class DiameterOfTree {

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

    int result = -1;
    public int findDiameter(TreeNode root){
        dfs(root);
        return result;
    }

    private int dfs(TreeNode current){
        if(current==null) return -1;
        int leftHeight = 1+dfs(current.left);
        int rightHeight = 1+dfs(current.right);
        result = Math.max(result, leftHeight+rightHeight);

        return Math.max(leftHeight, rightHeight);

    }

    public static void main(String[] args) {

        DiameterOfTree solution = new DiameterOfTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int result = solution.findDiameter(root);
        System.out.println("The max diameter is : " + result);
    }


    
}
