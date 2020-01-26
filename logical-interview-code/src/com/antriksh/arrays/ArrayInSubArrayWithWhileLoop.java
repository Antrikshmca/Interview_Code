package com.antriksh.arrays;

public class ArrayInSubArrayWithWhileLoop {

	static int i = 0, j = 0;
	static int arr1[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
	static int arr2[] = { 30, 40, 50, 60, 70, 80 };

	public static boolean findSubArray() {
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				i++;
				j++;
			} else {
				i++;
				j = 0;
			}
			if (j == arr2.length) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		boolean a = findSubArray();
		System.out.println(a);

	}

}
