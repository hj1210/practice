package com.leetcode;

import java.util.Arrays;

/**
 * @author himanshu
 * Remove Duplicates from a sorted array
 */
public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int l = 0, r = 1;
        for (;r < nums.length; r++) {
            while (r < nums.length && nums[r] == nums[l]) {
                r++;
            }
            if (r >= nums.length) break;
            l++;
            nums[l] = nums[r];
        }
        return l+1;
    }
	
	public static void main(String[] args) {
		int[] arr = {0, 2, 2, 2, 3, 3, 6, 6, 6};
		System.out.println(removeDuplicates(arr));
		System.out.println(Arrays.toString(arr));
	}

}
