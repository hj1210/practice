package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author himanshu
 * Two Sum problems
 */
public class TwoSumSet {

	public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> check = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i< nums.length; i++) {
            if (check.containsKey(target - nums[i])) {
                ans[0] = check.get(target - nums[i]);
                ans[1] = i;
                return ans;
            } else {
                check.put(nums[i], i);
            }
        }
        return ans;
    }
	
	public static int[] twoSum2(int[] numbers, int target) {
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
		System.out.println(Arrays.toString(twoSum1(arr, 14))); // 0 based indexing
		System.out.println(Arrays.toString(twoSum2(arr, 14))); // 1 based indexing
	}

}
