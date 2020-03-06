package com.antriksh.arrays;

public class FindFirstRepeatedElementArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 4, 6, };

		firstRepeating(arr);
	}

	public static void firstRepeating(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
