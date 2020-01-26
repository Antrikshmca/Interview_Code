package com.antriksh.string;

public class ImmutableClass {

	private int i;

	ImmutableClass(int i) {
		this.i = i;
	}

	public ImmutableClass modify(int i) {
		if (this.i == i) {
			System.out.println(i);
			return this;
		} else {
			return (new ImmutableClass(i));
		}
	}

	public static void main(String[] args) {
		ImmutableClass t = new ImmutableClass(10);
		ImmutableClass t2 = t.modify(100);
		ImmutableClass t3 = t.modify(10);

		System.out.println(t == t2);
		System.out.println(t == t3);
		System.out.println(t.getClass().getName());
		//
//		System.out.println(t.getDeclaredMethod);

	}

}
