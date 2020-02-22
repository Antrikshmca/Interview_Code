package com.antriksh.arrays.operation;

public class DeleteAtStart {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7 };
		int lenght=arr.length-1;
		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i + 1];
		}
		lenght--;
		for (int i = 0; i < arr.length -1; i++) {
			System.out.println(arr[i]);
		}
	}

}
