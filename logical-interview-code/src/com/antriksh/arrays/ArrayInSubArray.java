package com.antriksh.arrays;

public class ArrayInSubArray {

	static int arr1[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
	static int arr2[] = { 30, 40, 50, 60, 70, 80 };

	public static boolean findSubArray() {
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {

					i++;
					j++;
				}  

				
				if (j == arr2.length) {

					return true;
				}

				

			}

		}
		return true;
	}

	public static void main(String[] args) {

		boolean a=findSubArray();
		System.out.println(a);
	}

}
