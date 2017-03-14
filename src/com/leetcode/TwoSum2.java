package com.leetcode;

import java.util.Arrays;

/**
 * @author himanshu
 * Simple 2 pointer solution
 */
public class TwoSum2 {

	public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l =0, r = numbers.length - 1;
        while (l<r) {
            if (numbers[l] + numbers[r] > target) r--;
            else if (numbers[l] + numbers[r] < target) l++;
            else {
                ans[0] = l+1;
                ans[1] = r+1;
                return ans;
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int[] arr = {0, 2, 3, 5, 6, 7, 8, 9, 10};
		System.out.println(Arrays.toString(twoSum(arr, 14)));
	}

}
