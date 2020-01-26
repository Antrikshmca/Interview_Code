package com.antriksh.arrays;

public class InsertAtIndex {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 10, 24, };
		int pos = 3;
		int elemnet = 9;
		for (int i = arr.length - 2; i > pos ; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos ] = elemnet;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
