package com.antriksh.string.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CountCharacterInStriingUsingHashMap {
	static String str = "hello";

	public static void CountChar() {
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

		}
		/*Set<Map.Entry<Character, Integer>> set = map.entrySet();
		for (Map.Entry<Character, Integer> entry : set) {
			System.out.println("character  " + entry.getKey() + "   value " + entry.getValue());
		}*/
		
		map.forEach((k,v)->System.out.println(k+"  "+v));
		//map.forEach(System.out::println);
	}

	
	public static void main(String[] args) {

		CountChar();
	}

}
