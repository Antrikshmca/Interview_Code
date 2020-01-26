package com.antriksh.arrays;

public class FirstLargest {

	public static void main(String[] args) {
		int a[] = { 5, 3, 4, 6, 7, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
		}
		System.out.println(a[1]);
	}

}
