package com.leetcode;

/**
 * @author himanshu
 * Valid Palindrome
 */
public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        int l = 0, r = s.length() - 1;
        for (;l < r; l++, r--) {
            while (l < s.length() && !Character.isDigit(s.charAt(l)) && !Character.isLetter(s.charAt(l))) l++;
            while (r > -1 && !Character.isDigit(s.charAt(r)) && !Character.isLetter(s.charAt(r))) r--;
            if (l < s.length() && r > -1 && Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("abba"));
	}

}
