package com.leetcode;

/**
 * @author himanshu
 * Use XOR similar to SingleNumber problem.
 * Can also be solved using hash tables
 */
public class FindTheDifference {

	public static char findTheDifference(String s, String t) {
        if (s.isEmpty()) return t.charAt(0);
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            c = (char) (c ^ s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            c = (char) (c ^ t.charAt(i));
        }
        return c;
    }
	
	public static void main(String[] args) {
		System.out.println(findTheDifference("test", "stute"));
	}

}
