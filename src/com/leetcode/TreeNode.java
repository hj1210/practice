package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author himanshu
 * Binary tree class for leetcode problems
 */
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x) {
		val = x;
	}
	
	public static TreeNode treeNodeBuilder(int height, int bound) {
		if (height <= 0) return null;
		TreeNode t = new TreeNode(ThreadLocalRandom.current().nextInt(1, bound));
		if (height > 1) {
			t.left = treeNodeBuilder(height - 1, bound);
			t.right = treeNodeBuilder(height - 1, bound);
		}
		return t;
	}
	
	public void levelOrderPrint(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode t = q.poll();
			System.out.print(t.val + ", ");
			if (t.left != null) q.add(t.left);
			if (t.right != null) q.add(t.right);
		}
	}
	
	public void preOrderPrint(TreeNode t) {
		System.out.print(t.val + ", ");
		if (t.left != null) preOrderPrint(t.left);
		if (t.right != null) preOrderPrint(t.right);
	}
	
	public void inOrderPrint(TreeNode t) {
		if (t.left != null) inOrderPrint(t.left);
		System.out.print(t.val + ", ");
		if (t.right != null) inOrderPrint(t.right);
	}
	
	public void postOrderPrint(TreeNode t) {
		if (t.left != null) postOrderPrint(t.left);
		if (t.right != null) postOrderPrint(t.right);
		System.out.print(t.val + ", ");
	}
	
	public void print() {
        print("", true);
    }
	
	public void print(String prefix, boolean isTail) {
		System.out.println(prefix + (isTail ? "└── " : "├── ") + val);
		if (left != null)
			left.print(prefix + (isTail ? "    " : "│   "), false);
		if (right != null)
			right.print(prefix + (isTail ?"    " : "│   "), true);
	}
	
	public static void main(String args[]) {
		TreeNode t = TreeNode.treeNodeBuilder(3, 10);
		System.out.println();
		t.print();
		System.out.println();
		t.levelOrderPrint(t);
		System.out.println();
		t.preOrderPrint(t);
		System.out.println();
		t.inOrderPrint(t);
		System.out.println();
		t.postOrderPrint(t);
	}
}
