package com.antriksh.exception;

public class IllegalThreadstackException {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
		t.start();

	}

}
