package com.antriksh.stringpredefinedmethod;

//1. creating string using string literal has an advantage of
// returning string from scp
//2. if string is exits in scp it wont create new string
//3. creating string using new operator will always create new object it wont check the scp;
//4.here come the usage of intern method, when we create the string using new operator it should check in scp 
//that can be done with the help of intern method
public class StringInternDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		String s3=str2.intern();
		System.out.println(s3==str1);

	}

}
