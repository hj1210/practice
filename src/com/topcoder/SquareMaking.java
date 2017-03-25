package com.topcoder;

import java.util.Arrays;

/**
 * SRM 711 div2 Easy
 * @author himanshu
 *
 */
public class SquareMaking {
	public static int getMinimalPrice(int a, int b, int c, int d) {
        int[] arr = new int[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
    	Arrays.sort(arr);
        int i = 0, j = 3;
        int count = 0;
        while(i < j){
            count += arr[j]-arr[i];
            i++;
            j--;
        }
        return count;
    }
	
	public static void main(String[] args) {
//    	int[] arr = {1, 5, 8, 30, 15, 4};
    	System.out.println(getMinimalPrice(5, 5, 5, 5));
    }
}
