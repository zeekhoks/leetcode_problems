package data_structures.Trees;

import java.util.*;

public class LeafValueSequence {

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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean leafCheck = true;

        dfs(root1, list1);
        dfs(root2, list2);
        System.out.println("List 1: " + list1.size() + " List 2: " + list2.size());
        if (list1.size() == list2.size()) {
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).equals(list2.get(i))) {
                    leafCheck = true;
                } else {
                    leafCheck = false;
                    break;
                }
            }
        } else {
            leafCheck = false;
        }

        return leafCheck;
    }

    public void dfs(TreeNode root, List<Integer> list) {

        if (root == null)
            return;
        dfs(root.left, list);
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        dfs(root.right, list);
    }

    public static void main(String[] args) {

        LeafValueSequence solution = new LeafValueSequence();

        // Create the first tree root1 = [3,5,1,6,2,9,8,null,null,7,4]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        // root1.left.left = new TreeNode(6);
        // root1.left.right = new TreeNode(2);
        // root1.right.left = new TreeNode(9);
        // root1.right.right = new TreeNode(8);
        // root1.left.right.left = new TreeNode(7);
        // root1.left.right.right = new TreeNode(4);

        // Create the second tree root2 =
        // [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);
        // root2.left.left = new TreeNode(6);
        // root2.left.right = new TreeNode(7);
        // root2.right.left = new TreeNode(4);
        // root2.right.right = new TreeNode(2);
        // root2.right.right.left = new TreeNode(9);
        // root2.right.right.right = new TreeNode(8);

        boolean result = solution.leafSimilar(root1, root2);

        System.out.println("Answer : " + result);
    }

}
