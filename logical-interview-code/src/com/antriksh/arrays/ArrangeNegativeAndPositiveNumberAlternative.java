package com.antriksh.arrays;

import java.util.Arrays;

public class ArrangeNegativeAndPositiveNumberAlternative {

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
		int neg = 1;
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivot) {
				j++;
				swapData(arr, i, j);
			}
		}
		int pos = j + 1;
		while (pos < len && neg < pos && arr[neg] < 0) {
			swapData(arr, neg, pos);
			neg = neg + 2;
			pos = pos + 1;
		}
	}
}
