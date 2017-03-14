package com.leetcode;

/**
 * @author himanshu
 * 
 * Use two pointers, left and right on each end of array.
 * The amount of water will always be limited by smaller height.
 * Calculate current possible max and update pointers.
 */
public class ContainerWithMostWater {

	public static int maxArea(int[] height) {
        int j = height.length -1, i =0, mx=0;
        while (i<j) {
            mx = Math.max(mx, Math.min(height[i], height[j])*(j-i));
            if (height[i] < height[j]) i++;
            else j--;
        }
        return mx;
    }
	
	public static void main(String[] args) {
		int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(maxArea(arr));
	}

}
