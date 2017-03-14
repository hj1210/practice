package com.leetcode;

/**
 * @author himanshu
 */
public class RemoveNthNodeFromEnd {
	
	/**
	 * Remove nth node from end
	 * @param head
	 * @param n
	 * @return
	 */
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
	
	/**
	 * Delete current node
	 * @param node
	 */
	public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
	
	public static void main(String args[]) {
		System.out.println(removeNthFromEnd(ListNode.listNodeBuilder(5), 2));
		ListNode head = ListNode.listNodeBuilder(4);
		deleteNode(head.next.next);
		System.out.println(head);
	}
}
