package com.antriksh.arrays;

public class FindNextGreaterElement {

	public static void main(String[] args) {
		int arr[] = { 2,8,5,3,4,1 };
		for (int i = 0; i < arr.length; i++) {
			int next = -1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.println("next grater element " + arr[i] + "is " + next);

		}
	}

}
