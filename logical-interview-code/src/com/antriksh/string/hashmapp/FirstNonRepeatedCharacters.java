package com.antriksh.string.hashmapp;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacters {

		static String str = "SILLYSPIDER";
		public static void findFirstNonRepeated() {
			Map<Character, Integer> counts = new LinkedHashMap<>();
			for (char c : str.toCharArray()) {
				counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
			}
			for (Entry<Character, Integer> entry : counts.entrySet()) {
				if (entry.getValue() == 1) {
					System.out.println(entry.getKey());
					break;
				}
			}
		}

		public static void main(String[] args) {

			findFirstNonRepeated();
		}

	}
