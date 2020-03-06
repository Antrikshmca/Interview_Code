package com.antriksh.string;

public class FindAdjacentCountOfEachCharaters {

	public static void main(String[] args) {
		String str = "aabbbbbcccccdddddffffff";
		char[] ch = str.toCharArray();
		int count = 0;
		char temp = ' ';
		String finalResult = "";
		for (int i = 0; i < ch.length-1; i++) {
			
			if (ch[i] == ch[i+1])
			{
				temp=ch[i];
				count++;
			} else {
				finalResult = finalResult + temp + count;
				count = 1;
				temp = ch[i];
				
			}
			if (i == ch.length - 1) {
				finalResult = finalResult + temp + count;
			}
		}
		System.out.println(ch = finalResult.toCharArray());
	}
}
