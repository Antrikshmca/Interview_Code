package com.antriksh.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int start = 3;
		int halfRow = 4;
		for (int i = 1; i < halfRow; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(start);
			}
			System.out.println();
			start++;
		}
		System.out.println(start);
		start--;
		for (int i = halfRow; i >= 1; i--) {
			for (int j = i; j >= 1; j--)
				System.out.print(start);
			start--;
			System.out.println();
		}
	}

}

