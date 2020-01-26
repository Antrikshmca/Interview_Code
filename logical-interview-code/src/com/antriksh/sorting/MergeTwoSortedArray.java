package com.antriksh.sorting;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		int b[] = { 50, 60, 70, 80 };
		int al = a.length;
		int bl = b.length;
		int cl = al + bl;
		int c[] = new int[cl];
		for (int i = 0; i < al; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < bl; j++) {
			c[al + j] = b[j];
		}
		for (int k = 0; k < cl; k++) {
			System.out.println(c[k]);
		}

	}

}
