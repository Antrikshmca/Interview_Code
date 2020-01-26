package com.antriksh.basics;

import java.util.Scanner;

public class Vovel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character \n");
		String s = sc.next();
		char ch = s.charAt(0);
		if (ch >= 'A' && ch <= 'a' || ch >= 'a' && ch <= 'z') {
			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("it is vovel\n");
			} else {
				System.out.println("ts is not vovel \n");
			}
			System.out.println("it is constant\n");
		}

		else {
			System.out.println("it is not constant \n");
		}

	}

}
