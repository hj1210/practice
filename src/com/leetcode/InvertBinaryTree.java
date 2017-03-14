package com.leetcode;

/**
 * @author himanshu
 * Simple recursion
 */
public class InvertBinaryTree {

	public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode t = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(t);
        return root;
    }

	public static void main(String[] args) {
		TreeNode t = TreeNode.treeNodeBuilder(3, 10);
		t.print();
		invertTree(t).print();
	}

}
