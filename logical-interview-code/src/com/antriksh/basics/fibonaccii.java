package com.antriksh.basics;

import java.util.Scanner;

public class fibonaccii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number \n");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int result = fib(i);
			System.out.println(result + "\t");
		}

	}

	private static int fib(int no) {
		if (no == 0 || no == 1) {
			return 1;
		} else {
			return (fib(no - 1) + fib(no - 2));
		}
	}

}
