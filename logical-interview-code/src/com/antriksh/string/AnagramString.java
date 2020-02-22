package com.antriksh.string;

import java.util.Arrays;

public class AnagramString {

	public static boolean anagramcheck(String str1, String str2) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "avja";
		System.out.println("both string are anagram " + anagramcheck(str1, str2));
	}

}
