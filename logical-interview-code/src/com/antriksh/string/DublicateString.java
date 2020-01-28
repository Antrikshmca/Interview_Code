package com.antriksh.string;

import java.util.HashMap;
import java.util.Iterator;

public class DublicateString {

	public static void findDublicateWord(String str) {
		HashMap<String, Integer> hs = new HashMap<>();

		String[] s = str.split(" ");

		for (String tempString : s) {
			System.out.println(tempString);
			if (hs.get(tempString) != null) {
				hs.put(tempString, hs.get(tempString) + 1);

			} else {
				hs.put(tempString, 1);
			}
		}
		Iterator<String> t = hs.keySet().iterator();
		while (t.hasNext()) {

			String temp = t.next();
			if (hs.get(temp) > 1) {
				System.out.println("the word  " + temp + "   appred  " + hs.get(temp) + "  no of time  ");
			}
		}

	}

	public static void main(String[] args) {

		findDublicateWord(" I am am learning java java ");
		findDublicatecharacter(" java2eee ");
	}

	private static void findDublicatecharacter(String str) {

		HashMap<Character, Integer> hm=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
				if(hm.get(c)!=null){
					hm.put(c, hm.get(c)+1);
				}
				else
				{
					hm.put(c, 1);
				}
			}
			System.out.println(hm);
		}
		
	}


