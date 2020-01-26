package com.antriksh.arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 8 };
		int element = 6;
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (element == arr[i]) {
				
				for (int j = i;j< arr.length-1; j++) {
					
					arr[j] = arr[j + 1];
				}
				count++;
				
				break;
			}

		}
		if (count == 0) {
			System.out.println("elment not found");
		} else {
			System.out.println("successfully deleted");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
