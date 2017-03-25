package com.topcoder;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * SRM 610 - Level 1, Easy
 * @author himanshu
 *
 */
public class DivideByZero {
    public static int CountNumbers(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
    	HashSet<Integer> check = new HashSet<>();
        for (int i =0; i < numbers.length; i++) {
            check.add(numbers[i]);
            arr.add(numbers[i]);
        }
        int n = 0;
        // Arrays.sort(numbers);
        while (arr.size() > n) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size(); j++) {
                    if (i == j) continue;
                    if (arr.get(i) > arr.get(j) && !check.contains(arr.get(i)/arr.get(j))) {
                        Integer t = arr.get(i)/arr.get(j);
                    	check.add(t);
                        arr.add(t);
                    }
                }
            }
            n = arr.size();
        }
        return arr.size();
    }
    
    public static void main(String[] args) {
    	int[] arr = {1, 5, 8, 30, 15, 4};
    	System.out.println(CountNumbers(arr));
    }
}
