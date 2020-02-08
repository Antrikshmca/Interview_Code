package com.antriksh.arrays;

public class InsertAtIndex {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 10, 24,0 };
		int pos = 3;
		int elemnet = 5;
		for (int i = arr.length - 2; i > pos; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos] = elemnet;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
