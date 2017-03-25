package com.leetcode;

import java.util.Arrays;

/**
 * @author himanshu
 *
 */
public class LongestIncreasingSubsequence {

	public static int lengthOfLIS(int[] nums) {
        int[] sub = new int[nums.length];
        int len = 0;
        for (int i=0; i<nums.length; i++) {
            int index = Arrays.binarySearch(sub, 0, len, nums[i]);
            if (index < 0) {
                index = -(1+index);
            }
            if (index == len) {
                len++;
            }
            sub[index] = nums[i];
        }
        return len;
    }
	
	public static void main(String[] args) {
		int[] arr = {0, 8, 6, 2, 5, 0, 8, 3, 7};
		System.out.println(lengthOfLIS(arr));
	}

}
