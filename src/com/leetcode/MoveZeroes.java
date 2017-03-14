package com.leetcode;

import java.util.Arrays;

/**
 * @author himanshu
 * Move zeroes in an array to end.
 * Simple 2 pointers solution.
 */
public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
        int l=0, r=1;
        while (l < nums.length && nums[l] != 0)
            l++;
        if (l >= nums.length) return;
        r = l+1;
        for (; r < nums.length; r++) {
            if (nums[r] == 0) continue;
            nums[l] = nums[r];
            l++;
        }
        for (; l < nums.length; l++) nums[l] = 0;
    }
	
	public static void main(String[] args) {
		int[] arr = {0, 8, 6, 2, 5, 0, 8, 3, 7};
		System.out.println(Arrays.toString(arr));
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

}
