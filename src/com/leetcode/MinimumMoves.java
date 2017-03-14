package com.leetcode;

/**
 * @author himanshu
 *
 */
public class MinimumMoves {

	public static int minMoves(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            moves += nums[i] - min;
        }
        return moves;
    }
	
	public static void main(String[] args) {
		int[] arr = {0, 2, 3};
		System.out.println(minMoves(arr));
	}

}
