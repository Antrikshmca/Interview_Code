package com.antriksh.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	private static int partition(int arr[], int l, int h) {
		int p = arr[l];
		int start = l;
		int end = h;
		while (start < end){
			while (arr[start] <= p) {
				start++;
			}
		while (arr[end] > p) {
			end--;

		}
		if (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		}
		int temp = arr[l];
		arr[l] = arr[end];
		arr[end] = temp;
	
		return end;
	}

	private static void quicsort(int arr[], int l, int h) {
		if (l < h) {
			int loc = partition(arr, l, h);
			quicsort(arr, l, loc-1);
			quicsort(arr, loc + 1, h);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 4, 5, 7, 8, 3 };
		
		quicsort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
	}

} 
