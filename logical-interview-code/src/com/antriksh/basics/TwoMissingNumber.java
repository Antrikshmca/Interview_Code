package com.antriksh.basics;

import java.util.Arrays;

public class TwoMissingNumber {

	static int firstHalfNumber = 0, secondHalfNumber = 0;

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 6 };
		findTwoNumber(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void findTwoNumber(int arr[]) {
		int totalArraySize = arr.length + 2;
		int sum = (totalArraySize * (totalArraySize + 1) / 2) - getSum(arr);

		int avg = (sum / 2);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= avg) {
				firstHalfNumber += arr[i];

			} else {
				secondHalfNumber += arr[i];
			}
		}
		int totalFirstHalfNumber = (avg * (avg + 1) / 2 - firstHalfNumber);
		System.out.println("First Number");
		System.out.println(totalFirstHalfNumber);

		System.out.println("Second Number");
		System.out.println((((totalArraySize * (totalArraySize + 1)) / 2) - avg * (avg + 1) / 2) - secondHalfNumber);

	}

	private static int getSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
}
