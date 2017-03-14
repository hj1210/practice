package com.leetcode;

/**
 * @author himanshu
 * Remove nth node from end in a linked list
 * Definition for singly-linked list.
 */
public class RemoveNthNodeFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode right = dummy;
        for (int i=0; i<n; i++) {
            right = right.next;
        }
        ListNode left = dummy;
        while (right.next != null) {
            right = right.next;
            left = left.next;
        }
        right = left.next;
        left.next = right.next;
        right.next = null;
        head = dummy.next;
        dummy.next = null;
        return head;
    }
	
	public static void main(String args[]) {
		System.out.println(removeNthFromEnd(ListNode.listNodeBuilder(5), 2));
	}
}
