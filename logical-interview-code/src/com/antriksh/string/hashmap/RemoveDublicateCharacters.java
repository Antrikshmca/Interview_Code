package com.antriksh.string.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDublicateCharacters {

	static String str = "SILLYSPIDER";

	public static void findFirstNonRepeated() {
		Map<Character, Integer> counts = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
		}
		String res = "";
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			res = res + entry.getKey();
		}
		System.out.println(res);
	}
	public static void main(String[] args) {

		findFirstNonRepeated();
	}

}
