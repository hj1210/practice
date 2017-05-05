package com.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author himanshu
 *
 */
public class MinimumGeneticMutation {
	
	public static int minMutation(String start, String end, String[] bank) {
        char[] arr = {'A', 'T', 'G', 'C'};
        HashSet<String> dict = new HashSet<>();
        HashSet<String> seen = new HashSet<>();
        int count = 0;
        Queue<String> q = new LinkedList<>();
        q.add(start);
        q.add("");
        for (String s : bank) {
        	dict.add(s);
        }
        while(!q.isEmpty()) {
            StringBuffer t = new StringBuffer(q.remove());
            boolean isNewLevel = false;
            if ("".equals(q.peek())) isNewLevel = true; 
            if (t.equals(end)) return count;
            if (t.toString().equals("")) {
            	count++;
                continue;
            }
            for (int i =0; i < t.length(); i++) {
                for (char c : arr) {
                	if (c==t.charAt(i)) continue;
                	String edit = null;
                	if (i==0) {
                		edit = c + t.substring(i+1);
                	} else if (i == t.length() - 1) {
                		edit = t.substring(0, i) + c;
                	} else {
                		edit = t.substring(0, i) + c + t.substring(i+1);
                	}
                	if (dict.contains(edit)) {
                		if (edit.equals(end)) return (count + 1);
                		if (!seen.contains(edit)) q.add(edit);
                	}
                }
            }
            seen.add(t.toString());
            if (isNewLevel) q.add("");
        }
        return -1;
    }

	public static void main(String[] args) {
		String[] bank = {"AAAACCCA","AAACCCCA","AACCCCCA","AACCCCCC","ACCCCCCC","CCCCCCCC","AAACCCCC","AACCCCCC"};
		System.out.println(minMutation("AAAACCCC", "CCCCCCCC", bank));
	}

}
