package com.antriksh.basics;

public class FindMissingNumber {

	public static void main(String[] args) {
		int len = 8;
		int arr[] = { 1, 2, 3,4, 5,6,8 };
		System.out.println(Missing(arr, len));

	}

	private static int Missing(int arr[], int len) {
		return (len * (len + 1) / 2) - getsum(arr, len);
	}

	private static int getsum(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		return sum;
	}

}
