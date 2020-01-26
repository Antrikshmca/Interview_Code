package com.antriksh.string;

/**
 * @author Antriksh
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		String str = "SONYManish";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println(str.startsWith("SONY"));
		System.out.println(str.endsWith("h"));
		
		String str1 = "  hello  ";
		System.out.println(str1.trim());
		System.out.println(str1.indexOf('e'));
		System.out.println(str1.length());
		System.out.println(str1.contains("ll"));
		//method chaining
		String s3="    shivam  ";
		//System.out.println(s3.trim().substring(2).substring(3, 5));
		System.out.println(s3.split(" ")
				
				);
		
		
		
		System.out.println(str1.intern());
	}
}
