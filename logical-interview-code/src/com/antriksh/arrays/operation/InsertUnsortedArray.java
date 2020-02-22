package com.antriksh.arrays.operation;

public class InsertUnsortedArray {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, 7 };
		int pos = 2;
		int num = 5;
		int lenght = arr.length - 1;

		for (int i = 0; i < arr.length-1; i++) {
			arr[lenght-1]=arr[pos];
			
		}
		arr[pos]=num;
		lenght++;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
