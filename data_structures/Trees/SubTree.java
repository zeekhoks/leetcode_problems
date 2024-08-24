package data_structures.Trees;

public class SubTree {

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

    public boolean isSubTree(TreeNode root, TreeNode subRoot) {

        
        if(root!=null && subRoot == null) return true;
        if(root == null && subRoot != null) return false;
        
        if(isSameTree(root, subRoot)){
        return true;
        }

        return (isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot));
        
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null&&q==null) return true;
        if(p==null||q==null) return false;

        boolean leftCheck = isSameTree(p.left, q.left);
        boolean rightCheck = isSameTree(p.right, q.right);

        if(p.val==q.val && leftCheck && rightCheck){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        SubTree solution = new SubTree();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(2);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean result = solution.isSubTree(root, subRoot);
        
        System.out.println("Is subRoot part of root? Answer : " + result);
    }
    
}
