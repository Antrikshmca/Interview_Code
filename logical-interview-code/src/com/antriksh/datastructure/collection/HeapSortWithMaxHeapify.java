package com.antriksh.datastructure.collection;

import java.util.Arrays;

public class HeapSortWithMaxHeapify {

	public static void heapify(int[] arr, int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			max_Heap(arr, n, i);
		}
	}

	private static void max_Heap(int[] arr, int n, int i) {
		int large = i;
		int left = 2 * i + 1;
		
		int right = 2 * i + 2;

		if (left < n && arr[left] > arr[large]) {
			large = left;
		}
		if (right < n && arr[right] > arr[large]) {
			large = right;
		}
		if (large != i) {
			swapData(arr, large, i);
			max_Heap(arr, n, large);
		}
	}

	private static void sort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			swapData(arr, i, 0);
			max_Heap(arr, i, 0);
		}
	}

	static void swapData(int[] arr, int n, int i) {
		int temp = arr[n];
		arr[n] = arr[i];
		arr[i] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 11, 12, 13,5, 6, 7, 8 };
		heapify(arr, arr.length);
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
