package com.antriksh.exception;

public class ClassCastException {

	public static void main(String[] args) {
		Object o = new Object();
		String s = (String) o;
		System.out.println(s);

	}

}
