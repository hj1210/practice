package com.leetcode;

/**
 * @author himanshu
 * Easy recursive solution
 */
public class MaxDepthBinaryTree {
	
	public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
	
	public static void main(String args[]) {
		TreeNode t = TreeNode.treeNodeBuilder(3, 10);
		System.out.println(maxDepth(t));
	}
}
