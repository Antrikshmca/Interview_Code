package com.antriksh.basics;

class FindSmallestNumber {

	public static void main(String[] args) {
		int sqrt = sqrt(11);
		System.out.println(sqrt);
	}

	private static int sqrt(int num) {
		num = num * num * num;
		return num;
	}
}
