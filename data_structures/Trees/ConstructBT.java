package data_structures.Trees;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class ConstructBT {

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> M = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            M.put(inorder[i], i);
        }
        TreeNode root = splitTree(preorder, M, 0, 0, inorder.length-1);
        return root;
    }

    public TreeNode splitTree(int[] P, Map<Integer,Integer>M, int pix, int ileft, int iright){
        int rval = P[pix];
        int imid = M.get(rval);
        TreeNode root = new  TreeNode(rval);
        if(imid>ileft){
            root.left = splitTree(P, M, pix+1, ileft, imid-1);
        }
        if(imid<iright){
            root.right = splitTree(P, M, pix+imid-ileft+1, imid+1, iright);
        }

        return root;
    }

    public static void traversePreOrder(StringBuilder sb, TreeNode node){
        if(node!=null){
            sb.append(node.val);
            sb.append("\n");
            traversePreOrder(sb, node.left);
            traversePreOrder(sb, node.right);
        }
    }

    public static void printTree (PrintStream os, TreeNode root){
        StringBuilder sb = new StringBuilder();
        traversePreOrder(sb, root);
        os.print(sb.toString());
    }

    public static void main(String[] args) {

        ConstructBT solution = new ConstructBT();

        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode result = solution.buildTree(preorder, inorder);
        
        System.out.println("Answer : " );
        ConstructBT.printTree(System.out, result);
        
    }
    
}
