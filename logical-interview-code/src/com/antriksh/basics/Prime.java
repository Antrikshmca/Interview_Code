package com.antriksh.basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int count=1;
    	  System.out.println("enter the number");
    	  int n=sc.nextInt();
    	  for(int i=1;i<n;i++)
    	  {
    		  if(n%i==0)
    		  {
    			  count++;
    		  
    	  }    	  if(count==2)
    	  {
    		  System.out.println("it is prime number");
    	  }
    	  else
    	  {
    		  System.out.println("it is not prime number");
    	  }
      }
      
	}
}


