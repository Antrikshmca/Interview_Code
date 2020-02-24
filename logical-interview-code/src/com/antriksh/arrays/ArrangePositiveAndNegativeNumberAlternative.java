package com.antriksh.arrays;

import java.util.Arrays;

public class ArrangePositiveAndNegativeNumberAlternative {

	public static void swapData(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, -4, -1, 6, -9, -2, -3 };
		arrange(arr);

		System.out.println(Arrays.toString(arr));

	}

	private static void arrange(int[] arr) {
		int pivot = 0;
		int j = -1;
		int negative = 0;
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivot) {
				j++;
				swapData(arr, i, j);
			}
		}
		int postive = j + 1;
		while (postive < len && negative < postive && arr[negative] < 0) {
			swapData(arr, negative, postive);
			negative = negative + 2;
			postive = postive + 1;
		}
	}
}
