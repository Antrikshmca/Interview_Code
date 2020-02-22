package com.antriksh.arrays;

import java.util.Arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		int arr[] = { 6, 0, 4, 3, 0, 60, 7 };
		int pivot = 0;
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >pivot) {
				j++;
				swapData(arr, i, j);
			}

		}

		System.out.println(Arrays.toString(arr));
	}
	public static void swapData(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
