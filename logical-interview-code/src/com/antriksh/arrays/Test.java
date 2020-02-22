package com.antriksh.arrays;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int arr[] = { 7, 6, 4, 2, 3, 8 };
		int j;
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {

				arr[j + 1] = arr[j];

			}
			arr[j + 1] = temp;

		}
		System.out.println(Arrays.toString(arr));
	}

}
