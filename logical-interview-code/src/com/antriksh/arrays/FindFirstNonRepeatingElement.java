package com.antriksh.arrays;

public class FindFirstNonRepeatingElement {
	public static int arr[] = { 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {
		firstNonRepeating(arr);
	}

	static void firstNonRepeating(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				
				System.out.println(arr[i]);
			}
		}
	}

}
