package com.antriksh.string;

public class FindPalindrome {
	static String str = "xax";

	public static void main(String[] args) {
		char[] charArray = str.toCharArray();
		boolean findPalindrome = findPalindrome(charArray);
		System.out.println(findPalindrome);
	}

	public static boolean findPalindrome(char[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			int k = i + 1;
			if (j >= 0 && k < arr.length && arr[j] == arr[k]) {
			flag=true;
			}
			j = i;
			k = i + 2;
			if (j >= 0 && k < arr.length && arr[j] == arr[k]) {
				flag =true;
			}
		}
		return flag;
	}
}
