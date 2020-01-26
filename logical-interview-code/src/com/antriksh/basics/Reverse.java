package com.antriksh.basics;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int n,sum=0,r;
 System.out.println("enter the number");
 n=sc.nextInt();
 while(n>0)
 {
	 r=n%10;
	 sum=sum*10+r;
	 n=n/10;
 }
 System.out.println(sum);
	}

	
}
