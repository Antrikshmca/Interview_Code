package com.antriksh.basics;

import java.util.Scanner;

public class CelsiusDemo {

	public static void main(String[] args) {
		float temp;
		System.out.println("enter the temp");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextFloat();
		temp = ((temp - 32) * 5) / 9;
		System.out.println("temp in celsius  " + temp);
	}

}
