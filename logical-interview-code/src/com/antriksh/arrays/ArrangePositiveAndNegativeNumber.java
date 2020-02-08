package com.antriksh.arrays;

import java.util.Arrays;

public class ArrangePositiveAndNegativeNumber {
	public static void swapData(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, -4, -1, 6, -9 };
		int pivot = 0;
		int j = -1;
		int len = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivot) {
				j++;
				swapData(arr, i, j);
			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
