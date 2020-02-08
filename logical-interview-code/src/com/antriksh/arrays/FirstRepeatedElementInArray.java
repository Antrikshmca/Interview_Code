package com.antriksh.arrays;

import java.util.HashSet;

public class FirstRepeatedElementInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 2,4,6,4,6 };
		
		firstRepeating(arr);
	}

	public static void firstRepeating(int[] arr) {

		int minimum = -1;
		HashSet set = new HashSet();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i]))
				minimum = i;
			else
				set.add(arr[i]);
		}
		if (minimum != -1) {
			System.out.println("first repeating element is  : " + arr[minimum]);
		}
	}
}