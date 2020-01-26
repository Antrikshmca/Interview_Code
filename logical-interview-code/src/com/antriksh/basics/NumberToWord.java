package com.antriksh.basics;

import java.util.Scanner;

public class NumberToWord {

	String one[] = { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "eleven", "twelve",
			"thirteen", "fourteen", "fifteen", "sisteen", "seventeen", "eighteen", "nineteen" };
	String tens[] = { " ", " ", "tens", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public void display(int n, String ch) {
		if (n > 19) {
			System.out.println(tens[n / 10] + " " + one[n % 10]);

		} else {
			System.out.println(one[n]);
		}
		if (n > 0) {
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {

		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number \n");
		n = sc.nextInt();
		if (n < 0) {
			System.out.println("enter the number grater then 0");
		} else {
			NumberToWord a = new NumberToWord();
			a.display(((n / 10000000) % 100), "crore");
			a.display(((n / 100000) % 100), "lakh");
			a.display(((n / 1000) % 100), "thousand");
			a.display(((n / 100) % 100), "hundred");
			a.display((n % 100), " ");
		}
	}

}
