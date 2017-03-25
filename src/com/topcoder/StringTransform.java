package com.topcoder;

import java.util.HashSet;

/**
 * SRM 711 Div2 Medium
 * @author himanshu
 *
 */
public class StringTransform {
	public static String isPossible(String s, String t) {
        if (s.equals(t)) return "Possible";
        HashSet<Character> seen = new HashSet<>();
    	for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i) && !seen.contains(t.charAt(i))) return "Impossible";
            seen.add(s.charAt(i));
        }
        return "Possible";
    }
	
	public static void main(String[] args) {
    	System.out.println(isPossible("rdmcxnnbbe", "rdqrxrnxbe"));
    }
}
