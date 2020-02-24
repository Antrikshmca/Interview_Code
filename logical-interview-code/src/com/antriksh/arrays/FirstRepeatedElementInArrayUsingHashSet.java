package com.antriksh.arrays;

import java.util.HashSet;

public class FirstRepeatedElementInArrayUsingHashSet {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 4, 6 };

		int firstRepeating = firstRepeating(arr);
		System.out.println(firstRepeating);
	}

	public static int firstRepeating(int[] arr) {

		int firstRepeating = -1;
		HashSet set = new HashSet();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i]))
				// hold the value of repeating
				firstRepeating = arr[i];
			else
				set.add(arr[i]);
		}
		return firstRepeating;

	}
}