package com.antriksh.string;

import java.util.StringTokenizer;

public class StringSum {

	public static void main(String[] args) {
		String st = "10.5 67 78";
		double sum=0;
		StringTokenizer t = new StringTokenizer(st, " ");
		while (t.hasMoreTokens()) {
			sum=sum+Double.parseDouble(t.nextToken());
		}
		System.out.println(sum);

	}

}
