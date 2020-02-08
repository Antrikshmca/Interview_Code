package com.antriksh.arrays;

public class FindSecondLargestElementFromArray {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6, 77, 88, 99 };
		int fmax = 0;
		int smax = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > fmax) {
				smax = fmax;
				fmax = arr[i];
			}
			if (arr[i] > smax && fmax != arr[i]) {
				smax = arr[i];
			}
		}
		System.out.println("first max num" + fmax);
		System.out.println("second max num" + smax);
	}

}
