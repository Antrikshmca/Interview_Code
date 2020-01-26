package com.antriksh.string;

public class ReverseOfWord {

	public static void main(String[] args) {

		String str1 = "hello from java ";
		String revS = "";
		String words[] = str1.split(" ");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revW = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revW = revW + word.charAt(j);
			}
			revS = revS + revW + " ";

			
			
		}
		System.out.println(revS);

	}

}
