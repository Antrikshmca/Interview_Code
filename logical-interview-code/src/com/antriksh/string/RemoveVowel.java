package com.antriksh.string;

public class RemoveVowel {

	public static void main(String[] args) {
		vowelRemove();
	}

	public static void vowelRemove() {
		String str = "Antriksh";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'U')
				continue;

			else {
				result = result + str.charAt(i);
				
			}
		}
		System.out.println(result);
	}

}
