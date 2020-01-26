package com.antriksh.basics;

public class SwappingwiththirdVariable {

	public static void main(String[] args) {
int a=5,b=10,c=0;
c=a+b;
a=c-a;
b=c-b;
System.out.println( a+" "+b  );
	}

}
