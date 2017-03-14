package com.leetcode;

/**
 * @author himanshu
 * Calculate sum of two integers without using +/- operations
 */
public class SumOfTwoIntegers {

	public static int getSum(int a, int b) {
        while (b != 0){
            int c = (a & b) ; //CARRY is AND of two bits
          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = c << 1; //shifts carry to 1 bit to calculate sum
        }
        return a;
    }
	
	public static void main(String[] args) {
		System.out.println(getSum(20000, 120000));
	}

}
