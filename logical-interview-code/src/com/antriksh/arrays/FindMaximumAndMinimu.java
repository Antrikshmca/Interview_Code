package com.antriksh.arrays;

public class FindMaximumAndMinimu {

	public static void main(String[] args) {
		int arrays[] = { 1, 33, 44, 56, 66, 99 };
		int max = arrays[0];
		int min = arrays[0];
		for (int i = 0; i < arrays.length; i++) {
			if (arrays[i] > max) {
				max = arrays[i];
			}
			if (arrays[i] < min) {
				min = arrays[i];
			}
		}

		System.out.println("biggest Number " + max + "\n" + "smallest number " + min);
	}

}
