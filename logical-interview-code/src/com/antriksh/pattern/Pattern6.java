package com.antriksh.pattern;

/*print pattern

1 
1 2 
1 2 3 
1 2 3 4 
*/

public class Pattern6 {

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == i || j == 6 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
