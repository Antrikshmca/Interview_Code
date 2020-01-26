package com.antriksh.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String original, neww = " ";
		System.out.println("enter the string ");
		original = sc.nextLine();
		for (int i = original.length() - 1; i >= 0; i--) {
			neww = neww + original.charAt(i);
			// System.out.println(original);
		}
		System.out.println(neww);
	}

	
}
