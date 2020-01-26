package com.antriksh.arrays;

import javax.lang.model.element.Element;

public class InsertAtPosion {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 10, 24 };
		int pos = 3;
		int elemnet = 9;
		for (int i = arr.length - 1; i > pos - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos - 1] = elemnet;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
