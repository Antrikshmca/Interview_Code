package com.antriksh.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodDetails {

	public int m1(int a, int b) {
		return a + b;
	}

	private static int sub(int c, int d) {
		return c - d;
	}

	public static void main(String[] args) {
		MethodDetails d = new MethodDetails();
		Class c = d.getClass();
		Method[] m = c.getMethods();
		for (Method n : m) {

			System.out.println(n);
		}
		Method[] mm = c.getDeclaredMethods();
		for (Method nn : mm) {

			System.out.println(nn);
		}

		Class t = c.getSuperclass();
		System.out.println(t);

		int r = c.getModifiers();
		String s = Modifier.toString(r);
		System.out.println(s);

	}
}
