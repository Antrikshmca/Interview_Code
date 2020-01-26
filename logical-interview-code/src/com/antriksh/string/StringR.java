package com.antriksh.string;

import java.util.Arrays;

public class StringR {

	static int arr[] = { 11, 34, 56, 37, 67, 87 };

	public static void main(String[] args) {

		reverse(0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverse(int i, int j) {
		if (i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
			reverse(i, j);

		}
	}

}
