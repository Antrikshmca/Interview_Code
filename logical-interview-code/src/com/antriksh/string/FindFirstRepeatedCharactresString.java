package com.antriksh.string;

public class FindFirstRepeatedCharactresString {

	public static void main(String[] args) {
		int arr[] = new int[256];
		int pos[] = new int[256];
		String str = "MINIMUM";
		int rep = -1;
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 0) {
				arr[ch]++;
				pos[ch] = i;
			}
			if (ch == 1) {
				arr[ch]++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[ch] == 2) {
				if (rep == -1) {
					rep = pos[ch];
					
				} else if (rep > pos[ch]) {
					rep = pos[ch];
				
				
				}
			}
		}
		System.out.println(ch);
	}

}
