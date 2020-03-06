package com.antriksh.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindAdjacentCountOfEachCharaters2 {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 4, 1 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}
}
