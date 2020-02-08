package com.antriksh.arrays;

import java.util.Arrays;

public class FindMaximumOcurenceOfString {

	public static void main(String[] args) {
		int arr[] = new int[256];
		String str = "ABCDBBEB";
		int max = -1;
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}

		
		char ch = ' ';
		for (int j = 0; j < arr.length; j++) {
			if (max == -1) {
				max = arr[j];
			} else if (max < arr[j]) {
				max = arr[j];
				ch = (char) j;
			}
		}
		System.out.println(max);
		
		System.out.println(ch);
	}
}
