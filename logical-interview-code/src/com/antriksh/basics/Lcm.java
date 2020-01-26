package com.antriksh.basics;

public class Lcm {

	public static void main(String[] args) {
		int x = findGcd(8, 36);
		System.out.println(x);

		int y = findLcm(8, 12);
		System.out.println(y);

	}

	private static int findGcd(int a, int b) {
		if (b == 0)
			return a;

		else
			return (findGcd(b, a % b));
	}

	private static int findLcm(int a, int b) {
		return b;

	}
}
