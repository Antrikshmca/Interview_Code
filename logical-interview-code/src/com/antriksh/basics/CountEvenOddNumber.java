package com.antriksh.basics;

public class CountEvenOddNumber {

	public static void main(String[] args) {
		int n = 777584,rem;
		int evencount = 0, oddcount = 0;
		while (n > 0) {
			 rem = n%10;
			if (rem % 2 == 0) 
			
				evencount++;
			
			 else 
			 
				oddcount++;
				n=n/10;
			 
		}
		System.out.println("even count " + evencount);
		System.out.println("odd count " + oddcount);
	}

}
