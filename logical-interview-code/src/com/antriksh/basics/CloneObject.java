package com.antriksh.basics;

public class CloneObject implements Cloneable {

	Integer id = 1;
	String name = "dhanush";

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneObject o = new CloneObject();
		System.out.println(o.id);
		System.out.println(o.name);

		CloneObject b = (CloneObject) o.clone();
		System.out.println(b.id);
		System.out.println(b.name);

	}

}
