package com.antriksh.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfTwoArray {

	static int arr1[] = { 5, 3, 2, 5 };
	static int arr2[] = { 7, 6, 5, 6 };
	static int i = 0, j = 0;
	static List<Integer> outputList = new ArrayList<>();

	public static void findSum() {
		int sum = 0;
		while (i < arr1.length && j < arr2.length) {
			sum = arr1[i++] + arr2[j++];
			if (sum > 9) {
				splitNumber(sum);
			} else {
				outputList.add(sum);
			}
		}
		while (i < arr1.length) {
			sum = arr1[i++];
			if (sum > 9) {
				splitNumber(sum);
			} else {
				outputList.add(sum);
			}
		}
		while (j < arr1.length) {
			sum = arr1[j++];
			if (sum > 9) {
				splitNumber(sum);
			} else {
				outputList.add(sum);
			}
		}
	}

	public static void splitNumber(int num) {
		List<Integer> reverseList = new ArrayList<>();
		while (num != 0) {
			int rem = num % 10;
			reverseList.add(rem);
			num = num / 10;
		}
		Collections.reverse(reverseList);
		outputList.addAll(reverseList);
	}

	public static void main(String[] args) {
		findSum();
		System.out.println(outputList);
	}
}
