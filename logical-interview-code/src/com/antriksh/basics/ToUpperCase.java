package com.antriksh.basics;

public class ToUpperCase {

	public static void main(String[] args) {
		String str1 = "AntRiKsH";
		char ch[];
		ch = str1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			char chr = str1.charAt(i);
			if (chr >= 'A' && chr <= 'Z') {
				chr = (char) (chr + 32);

			}
			System.out.print(chr);
		}
	}

}
