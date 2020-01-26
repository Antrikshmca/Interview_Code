package com.antriksh.thread;

public class Thrid {

	public static void main(String[] args) {
		ThreadGroup g1 = new ThreadGroup("first");
		Thread t1 = new Thread(g1, "thread1");
		Thread t2 = new Thread(g1, "thread2");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1, "thread3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.start();
		t2.start();
		t3.start();
		System.out.println(g1.activeCount());
		System.out.println(g1.activeGroupCount());

	}

}
