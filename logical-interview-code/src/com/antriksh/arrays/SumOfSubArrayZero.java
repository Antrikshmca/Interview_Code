package com.antriksh.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfSubArrayZero {

	public static void main(String[] args) {
		displaySubarray();
	}

	private static void displaySubarray() {
		int[] input = new int[] { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		List<Integer> list = null;
		int sum = 0;
		// Loop across all elements of the array
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
			if (sum == 0) {
				System.out.println("SUM 0 Start: " + 0 + "-" + i);
			}
			// If preSum is present, it means that
			// Sub array found
			if (map.containsKey(sum)) {
				list = map.get(sum);
				for (int start : list) {
					System.out.println("SUM 0 Start: " + (start + 1) + "-" + i);
				}
			} else {
				list = new ArrayList<Integer>();
			}
			list.add(i);
			map.put(sum, list);
		}
	}
}
