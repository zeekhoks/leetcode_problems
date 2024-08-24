package data_structures.Trees;

public class SameTree {

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

        TreeNode proot = new TreeNode(1);
        proot.left = new TreeNode(2);
        proot.right = null;

        TreeNode qroot = new TreeNode(1);
        qroot.left = null;
        qroot.right = new TreeNode(2);

        boolean result = isSameTree(proot, qroot);
        
        System.out.println("Are p and q the same? Answer : " + result);
    }
    
}
