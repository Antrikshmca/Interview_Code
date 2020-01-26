package com.antriksh.basics;

import java.util.Scanner;

public class SumOfGivenNumber {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int sum=0,r;
 System.out.println("enter the number");
 int n=sc.nextInt();
 while(n>0)
 {
	 r=n%10;
	 sum=sum+r;
	 n=n/10;
	 
 }
 System.out.println(sum);
 
	}

}
