package com.leetcode;

import java.util.Arrays;

/**
 * @author himanshu
 * Product of array except self
 */
public class ProductArray {

	public static int[] productExceptSelf(int[] nums) {
        int r = nums.length;
        int[] forwardProducts = new int[r];
        int[] backwardProducts = new int[r];
        forwardProducts[0] = nums[0];
        for (int i=1; i<r; i++) {
            forwardProducts[i] = nums[i]*forwardProducts[i-1];
        }
        backwardProducts[r-1] = nums[r-1];
        for (int i=r-2; i>=0; i--) {
            backwardProducts[i] = nums[i]*backwardProducts[i+1];
        }
        int[] finalProducts = new int[r];
        finalProducts[0] = backwardProducts[1];
        finalProducts[r-1] = forwardProducts[r-2];
        for (int l=1;l<r-1;l++) {
            finalProducts[l] = forwardProducts[l-1] * backwardProducts[l+1];
        }
        return finalProducts;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 3};
		System.out.println(Arrays.toString(productExceptSelf(arr)));
	}

}
