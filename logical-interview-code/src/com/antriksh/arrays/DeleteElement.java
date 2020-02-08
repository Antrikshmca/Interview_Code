package com.antriksh.arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 8 };
		int pos=3;
		int lenght=arr.length-1;
		//int count=arr[pos-1];
		for (int i = arr.length-1; i < lenght; i++) {
			arr[i]=arr[i+1];
			//System.out.println(count);
		}
		lenght--;
		
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(arr[i]);
		}

	}

}
