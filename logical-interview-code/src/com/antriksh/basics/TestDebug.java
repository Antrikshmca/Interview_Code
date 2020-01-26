package com.antriksh.basics;
import java.util.*;
public class TestDebug {
	                 static void m1(double e, double d) {
		System.out.println("int float method");

	}

	static void m1(float a, int b) {
		System.out.println("float int method");
	}

	public static void main(String[] args) {
		int a=10;
		double d=5.3;
		m1(a, d);
		m1(5.6, 7);
	}
}
