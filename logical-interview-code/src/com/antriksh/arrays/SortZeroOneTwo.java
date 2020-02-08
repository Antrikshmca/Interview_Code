package com.antriksh.arrays;

import java.util.Arrays;

public class SortZeroOneTwo {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 1, 0, 2, 1 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] sort(int[] arr) {
		int zerocount = 0;
		int onecount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zerocount++;
			}
			if (arr[i] == 1) {
				onecount++;
			}
		}
		for (int j = 0; j < zerocount; j++) {
			arr[j] = 0;
		}
		for (int i = zerocount; i < (zerocount + onecount); i++) {
			arr[i] = 1;
		}
		for (int i = zerocount + onecount; i < arr.length; i++) {
			arr[i] = 2;
		}
		return arr;
	}
}
