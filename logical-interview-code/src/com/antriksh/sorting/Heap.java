package com.antriksh.sorting;

import java.util.Arrays;

public class Heap {

	int[] array = { 48, 32, 46, 29 };

	public static void main(String[] args) {
		Heap hs = new Heap();
		hs.heapSort();
	}

	private void heapSort() {
		for (int i = array.length - 1; i > 0; i--) {
			doSorting(i);
		}
		System.out.println(Arrays.toString(array));
	}

	private void doSorting(int last) {
		int start = 0;
		int left = 0;
		int right = 0;
		swapNode(start, last);
		left = 2 * start + 1;
		right = 2 * start + 2;
		while (right < last) {
			if (array[start] >= array[left] && array[start] >= array[right]) {
				return;
			}
			if (array[right] <= array[left]) {
				swapNode(start, left);
				start = left;
			} else {
				swapNode(start, right);
				start = right;
			}
			left = 2 * start + 1;
			right = 2 * start + 2;
		}
		if (left == last - 1 && array[start] < array[left]) {
			swapNode(start, left);
		}
	}

	private void swapNode(int start, int left) {
		int temp;
		temp = array[start];
		array[start] = array[left];
		array[left] = temp;
	}
}