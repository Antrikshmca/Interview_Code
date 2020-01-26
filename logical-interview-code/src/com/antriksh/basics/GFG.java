package com.antriksh.basics;

public class GFG {
	private static final int a;
	private final int b;
	static {
		a = 1;
	}

	GFG(int c) {
		b = c;
	}

	public static void main(String s[]) {
		GFG g1 = new GFG(10);
		GFG g2 = new GFG(20);
		System.out.println(GFG.a);
		System.out.println(g1.b);
		System.out.println(g1.b);
	}
}
