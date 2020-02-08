package com.antriksh.arrays;

public class FindMinimumElementOfArray {

	public static void main(String[] args) {
		int pos[] = { 4, 9, 7, 6, 5, 2 };
		int max = -1;
		for (int j = 0; j < pos.length; j++) {
			if (max == -1) {
				max = pos[j];
			} else if (max > pos[j]) {
				max = pos[j];
			}
		}
		System.out.println(max);
	}
}
