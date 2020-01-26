package com.antriksh.basics;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum = 0;
		int p = numberOfDigits(n);
		System.out.println(p);
		while (n > 0) {
			int r = n % 10;
			sum = sum + getPower(r, p);
			n = n / 10;
		}
		if (n == sum) {
			System.out.println("armstrong number" + n);
		} else {
			System.out.println("it is not armstrong number");
		}
	}

	private static int getPower(int r, int p) {
		int digit = 0;
		for (int i = 0; i < p; i++) {
			digit = digit * i;
		}
		return digit;
	}

	private static int numberOfDigits(int n) {
		int dcount = 0;
		while (n > 0) {
			dcount++;
			n = n / 10;
		}
		return dcount;
	}

}
