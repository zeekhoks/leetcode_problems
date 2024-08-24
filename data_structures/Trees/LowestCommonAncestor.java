package data_structures.Trees;

public class LowestCommonAncestor {
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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode current = root;
        TreeNode result = new TreeNode();

        while(current!=null){
            if(p.val>current.val && q.val>current.val){
                current = current.right;
            } else if (p.val<current.val && q.val<current.val){
                current = current.left;
            } else {
                result = current;
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        LowestCommonAncestor solution = new LowestCommonAncestor();

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.left.left = null;
        root.left.left.right = null;
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode result = solution.lowestCommonAncestor(root, new TreeNode(7), new TreeNode(9));
        
        System.out.println("What is the LCA of p & q? Answer : " + result.val);
    }
}
