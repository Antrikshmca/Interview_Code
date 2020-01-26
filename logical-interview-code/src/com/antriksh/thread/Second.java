package com.antriksh.thread;

public class Second {

	public static void main(String[] args) {
		//first constructor
		ThreadGroup g1=new ThreadGroup("first group");
		System.out.println(g1.getParent().getName());
//		secondConstructor
		ThreadGroup g2=new ThreadGroup(g1,"second Group");
		System.out.println(g2.getParent().getName());

	}

}
