package com.antriksh.string;

public class FindMaximumPalindrome {
	static String str = "xsranmnart";

	public static void main(String[] args) {
		char[] charArray = str.toCharArray();
		findPalindrome(charArray);
	}

	public static void findPalindrome(char[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			int k = i + 1;
			int start, end;
			if (j >= 0 && k < arr.length - 1 && arr[j] == arr[k]) {
				start = i;
				end = j;
				j++;
				i--;
				String substring = str.substring(start, end);
				System.out.println(substring);
			}
			j = i;
			k = i + 2;
			if (j >= 0 && k < arr.length - 1 && arr[j] == arr[k]) {
				start = i;
				end = j;
				j++;
				i--;
				String substring = str.substring(start, end);
				System.out.println(substring);
			}
		}

	}

}