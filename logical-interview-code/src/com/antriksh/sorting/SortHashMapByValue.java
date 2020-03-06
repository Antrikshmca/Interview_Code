package com.antriksh.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);
		map.put(2, 20);
		map.put(6, 60);
		HashMap<Integer, Integer> sortByValue = sortByValue(map);
		System.out.println(sortByValue);
	}

	private static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> map) {
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();

		ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
		Collections.sort(list, new MyComparator());
		list.forEach(x -> {
			System.out.println("key " + x.getKey() + " and value " + x.getValue());

		});

		return map;

	}
}
