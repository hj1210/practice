package com.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author himanshu
 *
 */
public class RotateArray {

	public static void rotateMethod1(int[] nums, int k) {
        k = k % nums.length;
        if (k==0 || nums.length <= 1) return;
        LinkedList<Integer> temp = new LinkedList<>();
        for (int i=0; i<k && i < nums.length;i++) {
            temp.add(nums[i]);
        }
        for (int i=k; i<nums.length; i++) {
            int t = nums[i];
            nums[i] = temp.poll();
            temp.add(t);
        }
        for (int i=0; i<k && i < nums.length;i++) {
            nums[i] = temp.poll();
        }
    }

	public static void rotateMethod2(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
	
	public static void main(String[] args) {
		int[] arr = {0, 2, 3, 5, 6, 7, 8, 9, 10};
		rotateMethod1(arr, 11);
		rotateMethod2(arr, 11);
		System.out.println(Arrays.toString(arr));
	}

}
