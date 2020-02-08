package com.antriksh.arrays;

import java.util.Arrays;

public class ArrangeEvenAndOddNumber {

	public static void swapData(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i++] = arr[j];
		arr[j--] = temp;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 7, 6, 1, 8, 3, 9, 5, 2 };
		int j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				j++;
				swapData(arr, i, j);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
