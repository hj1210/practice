package com.leetcode;

/**
 * @author himanshu
 * Odd Even Linked List
 */
public class OddEvenList {

	public static ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        ListNode l = head, r = head.next;
        if (r == null) return head;
        ListNode co = r.next, ce = r; // current even and odd
        while (co != null) {
            l.next = co;
            ce.next = co.next;
            co.next = r;
            l = l.next;
            ce = ce.next;
            if (ce !=null)
                co = ce.next;
            else
                co = null;
        }
        return head;
    }
	
	public static void main(String[] args) {
		System.out.println(oddEvenList(ListNode.listNodeBuilder(5)));
	}

}
