package com.antriksh.basics;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();

		printTable(number);
	}

	private static void printTable(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "*" + i + "=" + (number * i));
		}
	}

}
