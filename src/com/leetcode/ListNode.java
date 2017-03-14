package com.leetcode;

/**
 * @author himanshu
 * Linked list class for problems on leetcode
 */
public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
	public static ListNode listNodeBuilder(int length) {
		if (length <= 0) return null;
		ListNode head = new ListNode(0);
		ListNode l = head;
		for (int i = 1; i < length; i++) {
			l.next = new ListNode(i);
			l = l.next;
		}
		return head;
	}

	@Override
	public String toString() {
		return val + ", " + next;
	}
}