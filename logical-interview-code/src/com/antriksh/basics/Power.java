package com.antriksh.basics;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int n, p, sum = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number and its power");
		n = sc.nextInt();
		p = sc.nextInt();
		for (int i = 1; i <= p; i++) {
			sum = sum * p;
		}
		System.out.println(sum);
	}
}
