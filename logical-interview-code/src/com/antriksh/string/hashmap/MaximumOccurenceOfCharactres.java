package com.antriksh.string.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaximumOccurenceOfCharactres {

	static String str = "hello";

	public static void findMaximumRepeated() {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == ' ')
				continue;
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

			Set<Map.Entry<Character, Integer>> set = map.entrySet();
			char maxkey = ' ';
			int maxval = -1;
			for (Map.Entry<Character, Integer> data : set) {

				if (data.getValue() > maxval) {

					maxkey = data.getKey();
					maxval = data.getValue();
				}
			}
			System.out.println("maxkey " + maxkey + "  maximum value " + maxval);
		}
	}

	public static void main(String[] args) {

		findMaximumRepeated();
	}

}