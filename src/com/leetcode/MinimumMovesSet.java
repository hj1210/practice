package com.leetcode;

import java.util.Arrays;

/**
 * @author himanshu
 * Minimum Moves to Equal Array Elements problems
 */
public class MinimumMovesSet {

	public static int minMoves1(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            moves += nums[i] - min;
        }
        return moves;
    }

	public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        int count = 0;
        while(i < j){
            count += nums[j]-nums[i];
            i++;
            j--;
        }
        return count;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(minMoves1(arr));
		System.out.println(minMoves2(arr));
	}

}
