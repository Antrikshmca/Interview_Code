package com.antriksh.string;

public class contains {

	public static void main(String[] args) {
		String str1 = "MANISHSRIVASTAVA";
		String str2 = "ANISH";
		contains findSubString = new contains();
		boolean contains = findSubString.containss(str1, str2);
		System.out.println("Result = " + contains);
	}

	private boolean containss(String str1, String str2) {
		boolean flag = true;
		int j = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				int start = i;
				for (j = 0; j < str2.length(); j++) {
					if (str1.charAt(start++) != str2.charAt(j)) {
						return false;
					}
				}
				if (flag) {
					System.out.println("String found from index :: " + i + " to " + (j - 1));
					return true;
				}
			}
		}
		return flag;
		

	}

}
