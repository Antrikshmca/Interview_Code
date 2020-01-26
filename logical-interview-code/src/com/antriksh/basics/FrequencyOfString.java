package com.antriksh.basics;

public class FrequencyOfString {

	public static void main(String[] args) {

		String str2 = "abcabcabc";
		String str = "Srivastav";
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < str2.length() - 1; i++) {
			if (str2.charAt(i) == 'a') {
				a++;
			}
			if (str2.charAt(i) == 'b') {
				b++;
			}
			if (str2.charAt(i) == 'c') {
				c++;
			}

		}
		System.out.println("a = " + a + "\n" + "b =" + b + "\n" + "c= " + c);
		System.out.println(b);
	}
}
