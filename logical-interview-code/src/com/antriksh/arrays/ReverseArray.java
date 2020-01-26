package com.antriksh.arrays;

import java.util.Arrays;

public class ReverseArray {
	static int arr[] = { 1, 2, 3, 4, 5, 6 };

	public static void main(String[] args) {
		ReverseArray r = new ReverseArray();
		r.reverse(0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public void reverse(int start, int end) {
		int temp = 0;
		if (start < end) {
			temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
			reverse(start, end);
		}
	}

}
