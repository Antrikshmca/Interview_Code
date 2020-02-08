package com.antriksh.arrays;

import java.util.HashSet;

public class DublicateOccurence {

	public static void main(String[] args) {

		String[] arr1 = { "abc", "java", "javahungry", "java", "javahungry" };
		HashSet<String> set = new HashSet<String>();

		for (String val : arr1) {
			if (set.add(val) == false) {
				System.out.print(val + " ");
			}
		}
	}

}
