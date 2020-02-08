package com.antriksh.arrays;
/**
 *  1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

 * @author Antriksh
 *
 */
public class PascalTriangle {

	public static void main(String[] args) {
		int number = 5;
		int space = number;
		for (int i = 0; i < number; i++) {
			for (int k = 1; k < space; k++) {
				System.out.print(" ");
			}
			int no = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(no + " ");
				no = no * (i - j) / (1 + j);
			}
			space--;
			System.out.println();
		}
	}
}
