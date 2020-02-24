package com.antriksh.string;

public class CharactersReverse {
	static char ch[] = { 'a', 'b', 'c', 'd', 'e' };

	public static void main(String[] args) {

		reverse(0, ch.length - 1);
		System.out.println(new String(ch));
	}
	public static void reverse(int i, int j) {
		if (i < j) {
			char temp = ch[i];
			ch[i++] = ch[j];
			ch[j--] = temp;
			reverse(i, j);
		}
	}
}
