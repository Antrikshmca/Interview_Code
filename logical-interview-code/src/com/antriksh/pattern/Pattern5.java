package com.antriksh.pattern;

/*print pattern
1  
1  1  
1  1  1  
1  1  1  1  

*/

public class Pattern5 {

	public static void main(String[] args) {
		for (int i = 1; i <5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(1 +"  ");
			}
			System.out.println();
		}
		
	}

}
