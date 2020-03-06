package com.antriksh.string;

public class ReverseStringWithoutThirdVariable {

	public static void main(String[] args) {
		String str = "Dhanush";
		char[] charArray = str.toCharArray();
		char[] a = new char[charArray.length];
		int len = str.length();
		int i = 0;
		while (i != len) {
			a[len - 1 - i] = charArray[i];
			i++;
		}
		System.out.println(a);
	}

}
