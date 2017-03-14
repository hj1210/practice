package com.leetcode;

/**
 * @author himanshu
 * XOR all input. Duplicates are XORed to 0.
 */
public class SingleNumber {

	public static int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[0] ^= nums[i]; 
        }
        return nums[0];
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2,3, 4, 5, 4, 2, 3, 1};
		System.out.println(singleNumber(arr));		
	}

}
