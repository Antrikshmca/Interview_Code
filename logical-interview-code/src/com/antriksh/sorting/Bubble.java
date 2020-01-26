package com.antriksh.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {
		int arr[] = new int[6];
		int n;// = { 2, 7, 4, 1, 5, 3 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the No of element");
		n = sc.nextInt();
		System.out.println("enter the element");
		for (int k = 0; k < arr.length; k++) {
			arr[k] = sc.nextInt();
		}
		int i, j, temp;
		// Comparing first element with 2nd to end for i=0
		// first element with 2nd to end-1 for i=1
		// first element with 3rd to end-2 for i=2
		for (i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted arrya is ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\nDone");
	}
}
