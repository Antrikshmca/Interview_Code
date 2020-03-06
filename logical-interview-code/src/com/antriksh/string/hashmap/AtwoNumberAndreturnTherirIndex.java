package com.antriksh.string.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AtwoNumberAndreturnTherirIndex {

	public static void main(String[] args) {
		int[] number = new int[] { 2, 3, 7, 4, 8 };
		int target = 6;
		int[] result = getTwoSum(number, target);
		System.out.println(result[0] + " " + result[1]);
	}
	public static int[] getTwoSum(int[] number, int target) {
		Map<Integer, Integer> visitedNumber = new HashMap<>();
		for (int i = 0; i < number.length; i++) {
			int delta = target - number[i];
			if (visitedNumber.containsKey(delta)) {
				return new int[] { i, visitedNumber.get(delta) };
			}
			visitedNumber.put(number[i], i);
		}
		return new int[] { 0, 0 };
	}
}
