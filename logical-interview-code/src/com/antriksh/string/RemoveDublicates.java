package com.antriksh.string;

import java.util.Arrays;

public class RemoveDublicates {
	public static void main(String[] args) {

		RemoveDublicates rd = new RemoveDublicates();
		String str = "ABBBBBbbbc";
		char[] removeDuplicateChar = rd.removeDuplicateChar(str);
		System.out.println(Arrays.toString(removeDuplicateChar));
	}

	private char[] removeDuplicateChar(String str) {
		int j = 0;
		char arr[] = str.toCharArray();
		// Traversing string
		for (int i = 1; i < arr.length; i++) {
			if (arr[j] != arr[i]) {
				j++;
				arr[j] = arr[i];
			}
		}
		System.out.println("Size of J : " + j);

		for (int i = 0; i <= j; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return Arrays.copyOfRange(arr, 0, j + 1);
	}
}
