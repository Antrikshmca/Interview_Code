package com.antriksh.string;

public class FirstNonRepeatedCharacterFromString {

	public static void main(String[] args) {
		String str = "MINIMUM";
		int result = findFirstNonRepetingChar(str);
		
		System.out.println(str.charAt(result));
		// System.out.println(str.charAt(result));
	}

	private static int findFirstNonRepetingChar(String str) {
		int arr[] = new int[256];
		int pos[] = new int[256];

		int rep = -1;
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (arr[ch] == 0) {
				arr[ch]++;
				pos[ch] = i;
			} else if (arr[ch] == 1) {
				arr[ch]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				if (rep == -1) {
					rep = pos[i];

				} else if (rep > pos[i]) {
					rep = pos[i];
				}
			}
		}
		return rep;
	}
}
