package com.antriksh.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable {

	int x = 10;
	static transient int y = 40;

}

public class SerialDemo {

	public static void main(String[] args) throws Exception {
		Test t = new Test();
		FileOutputStream fos = new FileOutputStream("abc.sr");
		ObjectOutputStream ob = new ObjectOutputStream(fos);
		ob.writeObject(t);

		FileInputStream fis = new FileInputStream("abc.sr");
		ObjectInputStream obi = new ObjectInputStream(fis);
		Test ab = (Test) obi.readObject();
		System.out.println(t.x + "     " + t.y);

	}

}
