package com.antriksh.arrays;

import java.util.Arrays;

public class FindModOfArrray {
	public int mod(int arr[]) {
	
		int previous = arr[0], mod = arr[0];
		int count, maxcount;
		count = maxcount = 1;
		if (arr == null || arr.length == 0)
			return 0;
		Arrays.sort(arr);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == previous)
				count++;

			else {

				if (count > maxcount) {
					mod = arr[i - 1];
					maxcount = count;

				}
				previous = arr[i];
				count = 1;
			}
		}
		return count > maxcount ? arr[arr.length - 1] : mod;
	}

	public static void main(String[] args) {
		int[] a = { 1,2,2,3,3};
		FindModOfArrray aa = new FindModOfArrray();
		System.out.println(aa.mod(a));
	}

}
