package com.antriksh.string;

import java.util.Scanner;

public class SpecialSymbol {

	public static void main(String[] args) {
		String str = "Man#@ishRAM";
		char ch[] = str.toCharArray();
		for (int i = 0, j = str.length() - 1; i < j;) {
			
			if (!Character.isAlphabetic(ch[i])) {
				i++;
			} else if (!Character.isAlphabetic(ch[j])) {
				j--;
			} else {
				swapData(ch, i, j);
				i++;
				j--;
			}
		}
		System.out.println(new String (ch));

	}
	

	private static void swapData(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

}
