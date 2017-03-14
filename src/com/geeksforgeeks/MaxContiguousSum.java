/**
 * Solutions from geeksforgeeks practice space
 */
package com.geeksforgeeks;

import java.util.Scanner;

/**
 * @author himanshu
 * Given an array containing both negative and positive integers. Find the 
 * contiguous sub-array with maximum sum.
 * 
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. 
 * The description of T test cases follows. The first line of each test case contains a 
 * single integer N denoting the size of array. The second line contains N space-separated 
 * integers A1, A2, ..., AN denoting the elements of the array.
 * 
 * Output:
 * Print the maximum sum of the contiguous sub-array in a separate line for each test case.
 * 
 * Constraints:
 * 1 ≤ T ≤ 40
 * 1 ≤ N ≤ 100
 * -100 ≤ A[i] <= 100
 * 
 * Example:
 * Input
 * 2
 * 3
 * 1 2 3
 * 4
 * -1 -2 -3 -4
 * Output
 * 6
 * -1
 */
public class MaxContiguousSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=0; i<t; i++) {
		    int n = in.nextInt();
		    int maxSum = Integer.MIN_VALUE, maxEnd = 0;
		    for (int j=0; j< n; j++) {
		        int num = in.nextInt();
		        maxEnd += num;
		        if (maxSum < maxEnd) maxSum = maxEnd;
		        if (maxEnd <  0) maxEnd = 0;
		    }
		    System.out.println(maxSum);
		}
		in.close();
	}
}
