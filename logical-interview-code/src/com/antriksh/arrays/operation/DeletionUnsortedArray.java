package com.antriksh.arrays.operation;

import java.util.Arrays;

public class DeletionUnsortedArray {

	public static void main(String[] args) {
		int arr[] = { 23, 45, 11, 44, 66, 25, 60, };
		int lenght = arr.length - 1;
		int pos=2;
		for (int i = pos; i < arr.length; i++) {
			arr[pos]=arr[lenght];
		
		}
		lenght--;
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i]);
		}	}

}
